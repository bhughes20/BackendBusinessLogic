package com.example.applicants.businessLogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessLogicTest {

    @Test
    void calculateInsuranceQuote(){
        Double typeFactor = 1.3;
        Double engineSizeFactor = 1.0;
        Double additionalDriversFactor = 1.0;
        Double commercialUseFactor = 1.1;
        Double outsideStateFactor = 1.1;
        Double vehicleValueFactor = 1.1;

        double expectedResult = (100 * typeFactor * engineSizeFactor *
                additionalDriversFactor * commercialUseFactor * outsideStateFactor
                * vehicleValueFactor);

        BusinessLogic businessLogic = new BusinessLogic();

        double actualResult = businessLogic.calculateInsuranceQuote(typeFactor, engineSizeFactor,
                additionalDriversFactor, commercialUseFactor, outsideStateFactor, vehicleValueFactor);

        assertEquals(expectedResult, actualResult, 0.2);

    }
}