package com.example.hospitalManagement;

import com.example.hospitalManagement.models.Patient;
import com.example.hospitalManagement.repositories.PatientRepository;
import com.example.hospitalManagement.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepositories;
    @Autowired
    private PatientService patientService;


    @Test
    public void testPatientRepository(){
        List<Patient> patientList=this.patientRepositories.findAll();
        System.out.println(patientList);

        Patient p1=new Patient();
        patientRepositories.save(p1);
    }

    @Test
    public void testTransactionMethods(){
        Patient patient=patientService.getPatientById(1L);
        System.out.println(patient);
    }
}
