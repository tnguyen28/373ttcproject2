package com.example.ttcproject2.domain.facility;

public interface FacilityDetail {

    public String getName();
    public int getRoomNumber();
    public int getPhoneNumber();
    public int getFacilityID();
    public Facility getFacility();


    public void setName(String name);
    public void setRoomNumber(int roomNumber);
    public void setPhoneNumber(int phoneNumber);
    public void setFacilityID(int facilityID);
    public void setFacility(Facility facility);

}
