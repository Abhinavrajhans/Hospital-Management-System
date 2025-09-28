package com.example.hospitalManagement.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne
    @JoinColumn(name="patient_id",nullable =false) //patient is required and not nullable
    private Patient patient;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Doctor doctor;

    @CreationTimestamp
    @Column(nullable = false,updatable=false)
    private LocalDateTime createdAt;




}
