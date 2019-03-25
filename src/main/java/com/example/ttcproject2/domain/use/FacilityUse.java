package com.example.ttcproject2.domain.use;
import java.time.LocalDate;
import com.example.ttcproject2.domain.facility.*;
public interface FacilityUse {
   // public int getUseID();
   // public void setUseID(int useID);
    public int getFacilityID();
    public void setFacilityID(int facilityID);
    public int getRoomNumber();
    public void setRoomNumber(int roomNumber);
    public LocalDate getStartDate();
    public void setStartDate(LocalDate startDate);
    public LocalDate getEndDate();
    public void setEndDate(LocalDate endDate);
    public void setFacility(Facility facility);
    public Facility getFacility();
}
