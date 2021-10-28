package com.example.applicants.service.businessLogic;

import com.example.applicants.model.Applicant;
import org.springframework.stereotype.Service;

import static com.example.applicants.service.businessLogic.AdditionalDriversFactor.calculateAdditionalDriversFactor;
import static com.example.applicants.service.businessLogic.CommercialUseFactor.calculateCommercialUseFactor;
import static com.example.applicants.service.businessLogic.EngineSizeFactor.calculateEngineSizeFactor;
import static com.example.applicants.service.businessLogic.OutsideStateFactor.calculateOutsideStateFactor;
import static com.example.applicants.service.businessLogic.VehicleTypeFactor.calculateTypeFactor;
import static com.example.applicants.service.businessLogic.VehicleValueFactor.calculateVehicleValueFactor;

@Service
public class QuoteAmountCalculator {

    public void calculateInsuranceQuote(Applicant applicant){

        double typeFactor = calculateTypeFactor(applicant.getVehicleType());
        double engineSizeFactor = calculateEngineSizeFactor(applicant.getEngineSize());
        double additionalDriversFactor = calculateAdditionalDriversFactor(applicant.getAdditionalDrivers());
        double commercialUseFactor = calculateCommercialUseFactor(applicant.getCommercialPurposes());
        double outsideStateFactor = calculateOutsideStateFactor(applicant.getUsedOutsideState());
        double vehicleValueFactor = calculateVehicleValueFactor(applicant.getCurrentValue());

        double quoteAmount = (100 * typeFactor * engineSizeFactor * additionalDriversFactor
                * commercialUseFactor * outsideStateFactor * vehicleValueFactor);

        applicant.setQuoteAmount(quoteAmount);
    }
}
