package com.example.ttcproject2.domain.inspection;

import com.example.ttcproject2.domain.facility.*;

public interface Inspection {
    public int getInspectionID();
    public void setInspectionID(int inspectionID);
    public int getFacilityID();
    public void setFacilityID(int facilityID);
    public String getInspectionLocation();
    public void setInspectionLocation(String inspectionDetail);
    public String getInspectionDetail();
    public void setInspectionDetail(String inspectionDetail);
    public Facility getFacility();
    public void setFacility(Facility facility);
}
