package com.example.ttcproject2.domain.use;

import java.time.LocalDate;
import com.example.ttcproject2.domain.facility.*;

public class FacilityUseImpl implements FacilityUse {
    //private int useID;
    private int facilityID;
    private int roomNumber;
    private LocalDate startDate;
    private LocalDate endDate;

    private Facility facility;

    //public int getUseID() {
   //     return useID;
   // }
    public int getFacilityID() {
        return facilityID;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public Facility getFacility() {
        return facility;
    }

   // public void setUseID(int useID) {
    //    this.useID = useID;
    //}

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
