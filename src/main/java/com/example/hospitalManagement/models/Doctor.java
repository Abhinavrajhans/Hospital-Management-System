package com.example.hospitalManagement.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =100)
    private String name;

    @Column(length = 100)
    private String specilization;

    @Column(nullable = false,unique = true,length = 100)
    private String email;

    @OneToMany(mappedBy="doctor")
    private List<Appointment> appointmentList;


    @ManyToMany(mappedBy="doctors")
    @Builder.Default
    private Set<Department> departments=new HashSet<>();

    @CreationTimestamp
    @Column(nullable = false,updatable=false)
    private LocalDateTime createdAt;

}
