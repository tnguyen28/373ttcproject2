package com.example.ttcproject2.utility;

import com.example.ttcproject2.database.MaintenanceDAO;
import com.example.ttcproject2.domain.facility.Facility;
import com.example.ttcproject2.domain.maintenance.Maintenance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MaintenanceUtility {

    private MaintenanceDAO maintenanceDAO = new MaintenanceDAO();

    public Maintenance makeFacilityMaintRequest(Facility facility, String maintenanceDetails, int cost){
        //make Domain.facility request
        try {
            return maintenanceDAO.makeFacilityMaintRequest(facility, maintenanceDetails, cost);
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception making a Domain.facility Domain.maintenance request.");
            System.err.println(se.getMessage());
        }
        return null;
    }

    public void scheduleMaintenance(Maintenance maintRequest){
        //schedule Domain.maintenance
        try {
            maintenanceDAO.scheduleMaintenance(maintRequest, maintRequest.getFacility());
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception scheduling Domain.maintenance.");
            System.err.println(se.getMessage());
        }
    }

    public int calcMaintenanceCostForFacility(Facility facility){
        try {
            return maintenanceDAO.calcMaintenanceCostForFacility(facility);
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception calculating "
                    + "Domain.maintenance cost for Domain.facility.");
            System.err.println(se.getMessage());
        }
        return 0;
    }
    public double calcProblemRateForFacility(Facility facility){
        FacilityUseUtility useUtility = new FacilityUseUtility();
        try {
            LocalDate facilityStartDate = useUtility.getFacilityStartDate(facility);
            double totalDay = ChronoUnit.DAYS.between(facilityStartDate, LocalDate.now());
            return calcDownTimeForFacility(facility) / totalDay;
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception calculating the down time for a Domain.facility.");
            System.err.println(se.getMessage());
        }
        return 0;
    }

    public int calcDownTimeForFacility(Facility facility){
        int downTime= 0;
        try {
            int completedMaintItems = maintenanceDAO.listMaintenance(facility).size();
            downTime = completedMaintItems * 3;
        } catch (Exception se) {
            System.err.println("MaintenanceService: Threw an Exception calculating the down time.");
            System.err.println(se.getMessage());
        }
        return downTime;
    }

    public List<Maintenance> listMaintRequest(Facility facility){
        try {
            return maintenanceDAO.listMaintRequests(facility);
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception listing Domain.maintenance requests.");
            System.err.println(se.getMessage());
        }
        return null;
    }

    public List<Maintenance> listMaintenance(Facility facility){
        try {
            return maintenanceDAO.listMaintenance(facility);
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception listing Domain.maintenance");
            System.err.println(se.getMessage());
        }
        return null;
    }

    public List<Maintenance> listFacilityProblems(Facility facility){
        List<Maintenance> facilityProblems = new ArrayList<Maintenance>();
        try {
            facilityProblems.addAll(maintenanceDAO.listMaintRequests(facility));
            facilityProblems.addAll(maintenanceDAO.listMaintenance(facility));

            return facilityProblems;
        } catch (Exception se) {
            System.err.println("MaintenanceUtility: Threw an Exception listing Domain.facility problems.");
            System.err.println(se.getMessage());
        }
        return null;
    }

}