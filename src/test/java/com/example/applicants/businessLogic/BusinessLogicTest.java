package com.example.applicants.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessLogicTest {

    Double typeFactor, engineSizeFactor, additionalDriversFactor,
            commercialUseFactor, outsideStateFactor, vehicleValueFactor;
    Double typeFactor2, engineSizeFactor2, additionalDriversFactor2,
            commercialUseFactor2, outsideStateFactor2, vehicleValueFactor2;
    BusinessLogic businessLogic;

    @BeforeEach
    void setUp() {
        typeFactor = 1.3;
        engineSizeFactor = 1.0;
        additionalDriversFactor = 1.1;
        commercialUseFactor = 1.1;
        outsideStateFactor = 1.1;
        vehicleValueFactor = 1.0;

        typeFactor2 = 1.4;
        engineSizeFactor2 = 1.6;
        additionalDriversFactor2 = 1.2;
        commercialUseFactor2 = 1.0;
        outsideStateFactor2 = 1.0;
        vehicleValueFactor2 = 1.2;
        businessLogic = new BusinessLogic();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateInsuranceQuote1(){

        double expectedResult = (100 * typeFactor * engineSizeFactor *
                additionalDriversFactor * commercialUseFactor * outsideStateFactor
                * vehicleValueFactor);

        double actualResult = businessLogic.calculateInsuranceQuote(typeFactor, engineSizeFactor,
                additionalDriversFactor, commercialUseFactor, outsideStateFactor, vehicleValueFactor);

        assertEquals(expectedResult, actualResult, 0.2);
    }

    @Test
    void calculateInsuranceQuote2(){

        double expectedResult = 322.56;

        double actualResult = businessLogic.calculateInsuranceQuote(typeFactor2, engineSizeFactor2,
                additionalDriversFactor2, commercialUseFactor2, outsideStateFactor2, vehicleValueFactor2);

        assertEquals(expectedResult, actualResult, 0.2);
    }
}