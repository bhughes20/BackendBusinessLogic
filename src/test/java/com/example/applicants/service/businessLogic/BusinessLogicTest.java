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

        businessLogic = new BusinessLogic();
        applicant = new Applicant(3L, "prefix", "firstName", "lastName", "telephone", "address1", "address2",
                "city", "postcode","Hatchback", "1000", "1", "Yes", "No", "date",
                "10000", "N/A", 0.0 );
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