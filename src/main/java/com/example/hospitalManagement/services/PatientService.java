package com.example.hospitalManagement.services;


import com.example.hospitalManagement.models.Patient;
import com.example.hospitalManagement.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService{

    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id){
        return patientRepository.findById(id).orElseThrow();
    }
}
