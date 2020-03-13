package com.rewardsProgram.example.controller;

import com.rewardsProgram.example.model.Customer;
import com.rewardsProgram.example.model.Invoice;
import com.rewardsProgram.example.model.Transaction;
import com.rewardsProgram.example.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RewardsController {

    @Autowired
    RewardsService rewardsService;

    @PostMapping(value = "/getPoints", consumes = "application/json")
    public Invoice getPoints(@RequestBody Customer customer){
        List<Transaction> transactionList = customer.getTransactionList();
        //call to service
        return rewardsService.calculatePoints(transactionList);
    }
}
