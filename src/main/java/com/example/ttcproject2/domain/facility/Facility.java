package com.example.ttcproject2.domain.facility;

public interface Facility {
    public FacilityDetail getFacilityDetails();
    public void setFacilityDetails(FacilityDetail facilityDetail);
    public void setFacilityID(int facilityID);
    public int getFacilityID();
}
