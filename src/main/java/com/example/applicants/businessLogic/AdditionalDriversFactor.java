package com.example.applicants.businessLogic;

public class AdditionalDriversFactor {

    public double calculateAdditionalDriversFactor (String additionalDrivers){

        double additionalDriversFactor = 0.0;
        int additionalDriversAsInt = Integer.parseInt(additionalDrivers);

        if (additionalDriversAsInt < 2){
            return additionalDriversFactor = 1.1;
        } else {
            return additionalDriversFactor = 1.2;
        }
    }
}
