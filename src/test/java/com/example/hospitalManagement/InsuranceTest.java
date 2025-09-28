package com.example.hospitalManagement;

import com.example.hospitalManagement.models.Appointment;
import com.example.hospitalManagement.models.Insurance;
import com.example.hospitalManagement.models.Patient;
import com.example.hospitalManagement.services.AppointmentService;
import com.example.hospitalManagement.services.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testInsurance(){
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.now())
                .build();
        Patient patient = insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(patient );

    }

    @Test
    public void testCreateAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.now())
                .reason("Headache")
                .build();
        Appointment savedAppointment = appointmentService.createNewAppointment(appointment,1L,2L);
        System.out.println(savedAppointment);
    }
}
