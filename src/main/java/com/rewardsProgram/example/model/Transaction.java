package com.rewardsProgram.example.model;

import java.util.List;

public class Transaction {
    private List<Integer> amount;
    private String date;
   /* @JsonDeserialize(using = DateDeSerializer.class)
    private Date date;*/

    public Transaction(){
        super();
    }

    public Transaction(List<Integer> amount, String date){
        this.amount = amount;
        this.date = date;
    }

    public List<Integer> getAmount() {
        return amount;
    }

    public void setAmount(List<Integer> amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
