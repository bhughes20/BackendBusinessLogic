package com.example.applicants.businessLogic;

public class VehicleValueFactor {

    public double calculateVehicleValueFactor (String vehicleValue){

        double vehicleValueFactor = 0.0;
        int vehicleValueAsInt = Integer.parseInt(vehicleValue);

        if (vehicleValueAsInt <= 5000 ){
            return vehicleValueFactor = 1.0;
        } else {
            return vehicleValueFactor = 1.2;
        }
    }
}
