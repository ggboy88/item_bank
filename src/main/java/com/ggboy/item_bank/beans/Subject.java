package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjectinfo")
public class Subject {
    @Column(name = "Course_id")
    private String courseId;
    @Column(name = "Course_name")
    private String courseName;
    @Column(name = "Course_Specialty")
    private Integer courseSpecialty;

}
