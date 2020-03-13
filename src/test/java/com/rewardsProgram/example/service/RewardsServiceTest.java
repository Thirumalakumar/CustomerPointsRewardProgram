package com.rewardsProgram.example.service;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

class RewardsServiceTest {
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");

    @Test
    public  void test(){
        System.out.println(date);
    }

}