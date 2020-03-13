package com.rewardsProgram.example.model;

import java.util.List;

public class Customer {
    private List<Transaction> transactionList;
    //private List<List<Integer>,Integer>
    private int id;

    public Customer(){
        super();
    }
    public Customer(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
