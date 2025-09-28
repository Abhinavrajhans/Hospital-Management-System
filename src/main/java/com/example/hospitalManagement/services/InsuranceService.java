package com.example.hospitalManagement.services;

import com.example.hospitalManagement.models.Insurance;
import com.example.hospitalManagement.models.Patient;
import com.example.hospitalManagement.repositories.InsuranceRepository;
import com.example.hospitalManagement.repositories.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private InsuranceRepository insuranceRepository;
    private PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
            Patient patient = patientRepository.findById(patientId).orElseThrow(()->
                    new EntityNotFoundException("Patient with id: "+patientId+" not found"));

            patient.setInsurance(insurance);
            insurance.setPatient(patient); // bidirectional consistency maintainance.
            return patientRepository.save(patient);
    }
}
