package com.example.ttcproject2.domain.inspection;

import com.example.ttcproject2.domain.facility.*;

public class InspectionImpl implements Inspection {

    private int inspectionID;
    private int facilityID;
    private String inspectionLocation;
    private String inspectionDetail;

    private Facility facility;

    public InspectionImpl() {}

    public int getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(int inspectionID) {
        this.inspectionID = inspectionID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public String getInspectionLocation() {
        return inspectionLocation;
    }

    public void setInspectionLocation(String inspectionLocation) {
        this.inspectionLocation = inspectionLocation;
    }

    public String getInspectionDetail() {
        return inspectionDetail;
    }

    public void setInspectionDetail(String inspectionDetail) {
        this.inspectionDetail = inspectionDetail;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

}
