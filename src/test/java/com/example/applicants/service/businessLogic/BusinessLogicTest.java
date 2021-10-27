package com.example.applicants.service.businessLogic;

import com.example.applicants.model.Applicant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessLogicTest {

/*    Double typeFactor, engineSizeFactor, additionalDriversFactor,
            commercialUseFactor, outsideStateFactor, vehicleValueFactor;
    Double typeFactor2, engineSizeFactor2, additionalDriversFactor2,
            commercialUseFactor2, outsideStateFactor2, vehicleValueFactor2;

 */
    BusinessLogic businessLogic;
    Applicant applicant;

    @BeforeEach
    void setUp() {

    /*    typeFactor = 1.3;
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

     */

        businessLogic = new BusinessLogic();
        applicant = new Applicant();

        applicant.setVehicleType("Hatchback");
        applicant.setEngineSize("1000");
        applicant.setAdditionalDrivers("1");
        applicant.setCommercialPurposes("Yes");
        applicant.setUsedOutsideState("No");
        applicant.setCurrentValue("10000");

    }

    @AfterEach
    void tearDown() {
    }

    // CREATE METHOD TO getApplicant to use in all test cases

    @Test
    void calculateInsuranceQuote1(){

        double expectedResult = 232.32;

        businessLogic.calculateInsuranceQuote(applicant);

        assertEquals(expectedResult, applicant.getQuoteAmount(), 0.2);
    }

/*    @Test
    void calculateInsuranceQuote2(){

        double expectedResult = 322.56;

        double actualResult = businessLogic.calculateInsuranceQuote(applicant);

        assertEquals(expectedResult, actualResult, 0.2);
    }

 */
}