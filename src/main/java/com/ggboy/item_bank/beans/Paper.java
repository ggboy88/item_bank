package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "testpaperinfo")
public class Paper {
    @Column(name = "Paper_id")
    private Integer paperId;
    @Column(name = "Paper_course")
    private String paperCourse;
    @Column(name = "Paper_madedate")
    private String paperMadeDate;
    @Column(name = "Paper_teacher")
    private Integer paperTeacher;
    @Column(name = "Paper_choiceInfo")
    private String paperChoiceInfo;
    @Column(name = "Paper_TOFInfo")
    private String paperTOFInfo;
    @Column(name = "Paper_DesignInfo")
    private String paperDesignInfo;
    @Column(name = "Paper_BigInfo")
    private String paperBigInfo;
    @Column(name = "Paper_level")
    private String paperLevel;

    public Paper(String paperCourse, String paperMadeDate, Integer paperTeacher, String paperChoiceInfo, String paperTOFInfo, String paperDesignInfo, String paperBigInfo) {
        this.paperCourse = paperCourse;
        this.paperMadeDate = paperMadeDate;
        this.paperTeacher = paperTeacher;
        this.paperChoiceInfo = paperChoiceInfo;
        this.paperTOFInfo = paperTOFInfo;
        this.paperDesignInfo = paperDesignInfo;
        this.paperBigInfo = paperBigInfo;
    }

    public Paper(String paperCourse, String paperMadeDate, Integer paperTeacher, String paperChoiceInfo, String paperTOFInfo, String paperDesignInfo, String paperBigInfo, String paperLevel) {
        this.paperCourse = paperCourse;
        this.paperMadeDate = paperMadeDate;
        this.paperTeacher = paperTeacher;
        this.paperChoiceInfo = paperChoiceInfo;
        this.paperTOFInfo = paperTOFInfo;
        this.paperDesignInfo = paperDesignInfo;
        this.paperBigInfo = paperBigInfo;
        this.paperLevel = paperLevel;
    }

}
