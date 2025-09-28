package com.example.hospitalManagement.repositories;

import com.example.hospitalManagement.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
