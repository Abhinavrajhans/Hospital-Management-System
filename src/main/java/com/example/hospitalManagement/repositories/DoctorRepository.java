package com.example.hospitalManagement.repositories;

import com.example.hospitalManagement.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
