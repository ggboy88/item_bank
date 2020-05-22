package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Column(name = "id")
    private Integer id;
    @Column(name = "Teacher_id")
    private String TeacherId;
    @Column(name = "Teacher_name")
    private String TeacherName;
    @Column(name = "Teacher_Specialty")
    private String TeacherSpecialty;
    @Column(name = "username")
    @Pattern(regexp = "[1]{1}[356789]{1}\\d{9}",message = "手机号格式不对")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "flag")
    private Integer flag;

}
