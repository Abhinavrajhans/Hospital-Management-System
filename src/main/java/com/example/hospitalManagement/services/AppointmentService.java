package com.example.hospitalManagement.services;

import com.example.hospitalManagement.models.Appointment;
import com.example.hospitalManagement.models.Doctor;
import com.example.hospitalManagement.models.Patient;
import com.example.hospitalManagement.repositories.AppointmentRepository;
import com.example.hospitalManagement.repositories.DoctorRepository;
import com.example.hospitalManagement.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId,Long patientId )
    {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        if(appointment.getId() != null ) throw new IllegalArgumentException("Appointment already exists");
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        patient.getAppointments().add(appointment); // to maintain consistency

        return appointmentRepository.save(appointment);
    }


    @Transactional
    public Appointment reAssignAppointmentToAnotherDoctor(Long appointmentId, Long doctorId)
    {
        Appointment savedAppointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        savedAppointment.setDoctor(doctor); // this will automatically call the update , because it is dirty
        doctor.getAppointments().add(savedAppointment); // just for directional consistency
        return savedAppointment;
    }

}
