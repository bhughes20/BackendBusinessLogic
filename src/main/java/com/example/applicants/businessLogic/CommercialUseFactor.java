package com.example.applicants.businessLogic;

public class CommercialUseFactor {

    public double calculateCommercialUseFactor (String commercialUse){

        double commercialUseFactor = 0.0;

        if (commercialUse.equalsIgnoreCase("Yes")){
            return commercialUseFactor = 1.1;
        } else if (commercialUse.equalsIgnoreCase("No")){
            return commercialUseFactor = 1.0;
        } else {
            return commercialUseFactor;
        }
    }
}
