package com.ggboy.item_bank.utils;

public class ArrayUtils {

    public static String toStrings(String[] str){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i <= str.length - 1;i++){
            if (i == str.length - 1){
                stringBuffer.append(str[i]);
            }else {
                stringBuffer.append(str[i]);
                stringBuffer.append(",");
            }
        }
        return new String(stringBuffer);
    }

}
