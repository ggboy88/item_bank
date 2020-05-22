package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bigqstioninfo")
public class BigQst {
    @Column(name = "Big_id")
    private Integer BigId;
    @Column(name = "Big_question")
    private String BigQuestion;
    @Column(name = "Big_info")
    private String BigInfo;
    @Column(name = "Big_answ")
    private String BigAnsw;

}
