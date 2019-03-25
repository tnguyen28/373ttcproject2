package com.example.ttcproject2.domain.facility;

public class FacilityImpl implements Facility{
    private FacilityDetail facilityDetail;
    private int facilityID;

    public FacilityDetail getFacilityDetails(){
        return facilityDetail;
    }
    public void setFacilityDetails(FacilityDetail facilityDetail){
        this.facilityDetail = facilityDetail;
    }
    public void setFacilityID(int facilityID){
        this.facilityID = facilityID;
    }
    public int getFacilityID(){
        return facilityID;
    }

}
