package com.ggboy.item_bank.service.impl;

import com.ggboy.item_bank.beans.Paper;
import com.ggboy.item_bank.dao.PaperDao;
import com.ggboy.item_bank.dao.QstTypeDao;
import com.ggboy.item_bank.service.PaperService;
import com.ggboy.item_bank.service.SubjectService;
import com.ggboy.item_bank.utils.ArrayUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperDao paperDao;

    @Resource
    private QstTypeDao qstTypeDao;

    @Resource
    private SubjectService subjectService;

    @Override
    public void addPaper(Paper paper) {
        paperDao.insert(paper);
    }

    @Override
    public Paper capacity(String subject, Integer choiceCount, Integer tofCount, Integer designCount,
                          Integer bigCount, Integer level,Integer teacherId) {
        String[] choiceIdList =  qstTypeDao.selectQstByLevelAndSubjectAndType(subject,level,"选择题");
        String[] tofIdList = qstTypeDao.selectQstByLevelAndSubjectAndType(subject, level, "判断题");
        String[] designIdList = qstTypeDao.selectQstByLevelAndSubjectAndType(subject, level, "简答题");
        String[] bigIdList = qstTypeDao.selectQstByLevelAndSubjectAndType(subject, level, "应用题");

        Random random = new Random();
        int tempId1;
        for (int i = 0;i <= choiceIdList.length - 1;i++){
            tempId1 = random.nextInt(choiceIdList.length);
            String temp = choiceIdList[i];
            choiceIdList[i] = choiceIdList[tempId1];
            choiceIdList[tempId1] = temp;
        }

        String[] choiceId = new String[choiceCount];
        for (int i = 0;i <= choiceCount-1;i++){
            choiceId[i] = choiceIdList[i];
        }
        String choice = ArrayUtils.toStrings(choiceId);

        int tempId2;
        for (int i = 0;i <= tofIdList.length - 1;i++){
            tempId2 = random.nextInt(tofIdList.length);
            String temp = tofIdList[i];
            tofIdList[i] = tofIdList[tempId2];
            tofIdList[tempId2] = temp;
        }

        String[] tofId = new String[tofCount];
        for (int i = 0;i <= tofCount-1;i++){
            tofId[i] = tofIdList[i];
        }
        String tof = ArrayUtils.toStrings(tofId);

        int tempId3;
        for (int i = 0;i <= designIdList.length - 1;i++){
            tempId3 = random.nextInt(designIdList.length);
            String temp = designIdList[i];
            designIdList[i] = designIdList[tempId3];
            designIdList[tempId3] = temp;
        }

        String[] designId = new String[designCount];
        for (int i = 0;i <= designCount-1;i++){
            designId[i] = designIdList[i];
        }
        String design = ArrayUtils.toStrings(designId);

        int tempId4;
        for (int i = 0;i <= bigIdList.length - 1;i++){
            tempId4 = random.nextInt(bigIdList.length);
            String temp = bigIdList[i];
            bigIdList[i] = bigIdList[tempId4];
            bigIdList[tempId4] = temp;
        }

        String[] bigId = new String[bigCount];
        for (int i = 0;i <= bigCount-1;i++){
            bigId[i] = bigIdList[i];
        }
        String big = ArrayUtils.toStrings(bigId);

        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = simpleDateFormat.format(now);
        Paper paper = new Paper(subject, format, teacherId, choice, tof, design, big, level.toString());

        return paper;
    }

    @Override
    public List<Paper> selectPaperByUserId(Integer id) {
        List<Paper> papers = paperDao.selectPaperByUserId(id);
        ArrayList<Paper> paperList = new ArrayList<>();
        for (Paper p :
                papers) {
            String paperCourse = p.getPaperCourse();
            String name = subjectService.selectSubNameById(paperCourse);
            p.setPaperCourse(name);
            paperList.add(p);
        }
        return paperList;
    }

    @Override
    public Paper selectPaperById(Integer paperId) {
        return paperDao.selectPaperById(paperId);
    }

    @Override
    public void deletePaperById(Integer paperId) {
        Paper paper = new Paper();
        paper.setPaperId(paperId);
        paperDao.delete(paper);
    }
}
