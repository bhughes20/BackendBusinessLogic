package com.example.applicants.service;

import com.example.applicants.model.Applicant;
import com.example.applicants.repository.ApplicantRepository;
import com.example.applicants.service.businessLogic.QuoteAmountCalculator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {

    private final ApplicantRepository repository;
    private final QuoteAmountCalculator quoteAmountCalculator;

    public ApplicantService(ApplicantRepository repository, QuoteAmountCalculator quoteAmountCalculator) {
        this.repository = repository;
        this.quoteAmountCalculator = quoteAmountCalculator;
    }

    public List<Applicant> getAllApplicants() {
        return repository.findAll();
    }

    public Applicant save(Applicant applicant) {
        quoteAmountCalculator.calculateInsuranceQuote(applicant);
        return repository.save(applicant);
    }//Save a New Record

    public Optional<Applicant> getSingleApplicant(Long id) {
        return repository.findById(id);
    } //GET a single applicant


    public void deleteSingleApplicant(Long id) {
        repository.deleteById(id);
    } //DELETE

    public Optional<Applicant> updateNumber(Long id, String telephoneNumber) {

        return repository.findById(id)
                .map(recordForUpdating -> {
                    recordForUpdating.setTelephoneNumber(telephoneNumber);
                    return repository.save(recordForUpdating);
                });
    }//Update Number
}
