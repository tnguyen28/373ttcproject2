package com.example.ttcproject2.domain.maintenance;

public class MaintOrderImpl implements MaintOrder{

    private String details;
    private CostImpl cost;

    public double getCost() {
        return cost.getTotalCost();

    }
    public String getDetails() { return details; }

    public void setDetails(String details) { this.details = details;}
}
