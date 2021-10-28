package com.example.applicants.service.businessLogic;

import com.example.applicants.model.Applicant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestQuoteAmount {

    QuoteAmountCalculator quoteAmountCalculator;
    Applicant applicant;
    Applicant applicant2;
    Applicant applicant3;

    @BeforeEach
    void setUp() {

        quoteAmountCalculator = new QuoteAmountCalculator();
        applicant = new Applicant(3L, "prefix", "firstName", "lastName",
                "telephone", "address1", "address2",
                "city", "postcode","Hatchback", "1000", "1",
                "Yes", "No", "date",
                "10000", "N/A", 0.0 );
        applicant2 = new Applicant(4L, "prefix", "firstName", "lastName",
                "telephone", "address1", "address2",
                "city", "postcode","Cabriolet", "3000", "1",
                "No", "No", "date",
                "15000", "N/A", 0.0 );
        applicant3  = new Applicant(5L, "prefix", "firstName", "lastName",
                "telephone", "address1", "address2",
                "city", "postcode","Hatchback", "1600", "3",
                "Yes", "Yes", "date",
                "5000", "N/A", 0.0 );
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateInsuranceQuote1(){

        double expectedResult = 232.32;

        quoteAmountCalculator.calculateInsuranceQuote(applicant);

        assertEquals(expectedResult, applicant.getQuoteAmount(), 0.2);
    }

    @Test
    void calculateInsuranceQuote2(){

        double expectedResult = 514.80;

        quoteAmountCalculator.calculateInsuranceQuote(applicant2);

        assertEquals(expectedResult, applicant2.getQuoteAmount(), 0.2);
    }

    @Test
    void calculateInsuranceQuote3(){

        double expectedResult = 371.712;

        quoteAmountCalculator.calculateInsuranceQuote(applicant3);

        assertEquals(expectedResult, applicant3.getQuoteAmount(), 0.3);
    }
}