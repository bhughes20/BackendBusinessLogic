package com.example.applicants.businessLogic;

public class BusinessLogic {

    public double calculateInsuranceQuote(Double typeFactor, Double engineSizeFactor,
                                          Double additionalDriversFactor, Double commercialUseFactor,
                                          Double outsideStateFactor, Double vehicleValueFactor){

        return (100 * typeFactor * engineSizeFactor * additionalDriversFactor
                * commercialUseFactor * outsideStateFactor * vehicleValueFactor);
    }
}
