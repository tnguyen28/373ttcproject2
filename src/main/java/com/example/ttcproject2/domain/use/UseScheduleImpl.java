package com.example.ttcproject2.domain.use;

import java.time.LocalDate;

public class UseScheduleImpl {


    private LocalDate startDate;
    private LocalDate endDate;

    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }

    public void setStartDate(LocalDate start) { this.startDate = start;}
    public void setEndDate(LocalDate end) {this.endDate = end; }
}
