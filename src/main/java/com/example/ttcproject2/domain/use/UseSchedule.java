package com.example.ttcproject2.domain.use;

import java.time.LocalDate;

public interface UseSchedule {

    public LocalDate getStartDate();
    public LocalDate getEndDate();

    public void setStartDate(LocalDate start);
    public void setEndDate(LocalDate end);
}
