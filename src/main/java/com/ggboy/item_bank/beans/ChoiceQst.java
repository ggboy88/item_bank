package com.ggboy.item_bank.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "choiceqstinfo")
public class ChoiceQst {
    @Column(name = "ChoiceQst_id")
    private Integer choiceQstId;
    @Column(name = "ChoiceQst_question")
    private String choiceQstQuestion;
    @Column(name = "ChoiceQst_info")
    private String choiceQstInfo;
    @Column(name = "ChoiceQst_op1")
    private String choiceQstOp1;
    @Column(name = "ChoiceQst_op2")
    private String choiceQstOp2;
    @Column(name = "ChoiceQst_op3")
    private String choiceQstOp3;
    @Column(name = "ChoiceQst_op4")
    private String choiceQstOp4;
    @Column(name = "ChoiceQst_answ")
    private String choiceQstAnsw;

}
