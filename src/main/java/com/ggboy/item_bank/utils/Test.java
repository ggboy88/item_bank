package com.ggboy.item_bank.utils;


import com.ggboy.item_bank.beans.ChoiceQst;

import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        String[] A = {"1","2","3","4","5","6","7"};

        int tempId;
        Random rdm = new Random();
        for (int i = 0;i <= A.length-1;i++){
            tempId = rdm.nextInt(A.length);
            String temp = A[i];
            A[i] = A[tempId];
            A[tempId] = temp;
        }

        for (int i = 0; i <= 30;i++){
            System.err.println(rdm.nextInt(5));
        }
    }

}
