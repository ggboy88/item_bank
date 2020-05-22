package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questiontypeinfo")
public class QstType {
    @Column(name = "Question_id")
    private String questionId;
    @Column(name = "Question_name")
    private String questionName;
    @Column(name = "Question_level")
    private String questionLevel;
    @Column(name = "Question_course")
    private String questionCourse;
    @Column(name = "Question_teacher")
    private String questionTeacher;

}
