package com.example.hospitalManagement.repositories;

import com.example.hospitalManagement.models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance,Long> {
}
