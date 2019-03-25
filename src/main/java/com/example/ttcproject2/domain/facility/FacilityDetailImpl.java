package com.example.ttcproject2.domain.facility;

public class FacilityDetailImpl implements FacilityDetail{
    private int facilityID;
    private String name;
    private int roomNumber;
    private int phoneNumber;
    private Facility facility;

    public String getName(){
        return name;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public int getFacilityID(){
        return facilityID;
    }
    public Facility getFacility(){
        return facility;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setFacilityID(int facilityID){
        this.facilityID = facilityID;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setFacility(Facility facility){
        this.facility = facility;
    }
}
