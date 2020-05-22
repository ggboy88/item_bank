package com.ggboy.item_bank.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class SmsUtil {
    //产品名称:云通信短信API产品,开发者无需替换
    static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    static final String domain = "dysmsapi.aliyuncs.com";

    static final String accessKeyId ;
    static final String accessKeySecret ;
    static {
        InputStream inputStream = SmsUtil.class.getClassLoader().getResourceAsStream("sms.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        accessKeyId = properties.getProperty("accessKeyId");
        accessKeySecret = properties.getProperty("accessKeySecret");
    }

    public static SendSmsResponse sendSms(HttpSession session,String tel) throws ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(tel);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("试题库管理系统");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_187745910");
        //手机验证码
        StringBuffer randomNum = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            randomNum.append(new Random().nextInt(10));
        }
        request.setTemplateParam("{'code':"+randomNum+"}");//模板中code参数,接受按照json字符串进行接受

        session.setAttribute("phoneVarificationCode",randomNum);

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        return sendSmsResponse;
    }


}
