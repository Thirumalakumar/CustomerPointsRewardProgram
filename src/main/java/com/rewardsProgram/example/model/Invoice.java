package com.rewardsProgram.example.model;

import java.util.HashMap;

public class Invoice {
    private HashMap<String, Integer> monthlyRewardPoints = new HashMap<>();
    private int totalRewardPoints;

    public Invoice(HashMap<String, Integer> monthlyRewardPoints, int totalRewardPoints) {
        this.monthlyRewardPoints = monthlyRewardPoints;
        this.totalRewardPoints = totalRewardPoints;
    }

    public Invoice() {
        super();
    }

    public HashMap<String, Integer> getMonthDetails() {
        return monthlyRewardPoints;
    }

    public void setMonthDetails(HashMap<String, Integer> monthDetails) {
        this.monthlyRewardPoints = monthDetails;
    }

    public int getTotalRewardPoints() {
        return totalRewardPoints;
    }

    public void setTotalRewardPoints(int totalRewardPoints) {
        this.totalRewardPoints = totalRewardPoints;
    }
}
