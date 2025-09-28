package com.example.hospitalManagement.repositories;

import com.example.hospitalManagement.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
