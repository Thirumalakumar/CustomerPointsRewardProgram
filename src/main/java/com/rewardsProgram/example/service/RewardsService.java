package com.rewardsProgram.example.service;

import com.rewardsProgram.example.model.Invoice;
import com.rewardsProgram.example.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class RewardsService {

    public Invoice calculatePoints(List<Transaction> transactionList){
        //check each transcation for each month
        //calculate total
        Invoice invoice = new Invoice();
        int totalRewards=0;
        List<Integer> eachMonthTotal = new ArrayList<Integer>();
        HashMap<String, Integer> invoiceDetails = new HashMap<>();
        for(Transaction transaction : transactionList){
            int totalPoints = totalPoints(transaction);
            invoiceDetails.put(transaction.getDate(),totalPoints);
            eachMonthTotal.add(totalPoints);
        }
        totalRewards = eachMonthTotal.stream().mapToInt(k -> k).sum();
        invoice.setMonthDetails(invoiceDetails);
        invoice.setTotalRewardPoints(totalRewards);
        return invoice;
    }
    private int totalPoints(Transaction transaction){
        List<Integer> amountList = transaction.getAmount();
        int points;
        int sum = 0;
        for(Integer amount:amountList){
            points = 0;
            if(amount > 100){
                points = points + (amount - 100) * 2;
            }
            if(amount > 50){
                points = points + (amount-points/2) - 50;
            }
            sum+=points;
        }
        return sum;
    }
}
