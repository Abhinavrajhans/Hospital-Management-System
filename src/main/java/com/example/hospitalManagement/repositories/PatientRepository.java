package com.example.hospitalManagement.repositories;

import com.example.hospitalManagement.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // when giving <Patient,Integer>
    // the first parameter signifies which table repo is this , so this is a Patient Repository
    // and the second thing is the patient id is what type the potient id key is Long
}
