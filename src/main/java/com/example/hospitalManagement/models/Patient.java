package com.example.hospitalManagement.models;

import com.example.hospitalManagement.models.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(
        name="patient"
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,length = 50)
    private String name;


    private LocalDateTime birthDate;

    @Column(unique = true, nullable =false)
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable=false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="patient_insurance_id") //owing side
    private Insurance insurance;


    @OneToMany(mappedBy = "patient" , cascade = {CascadeType.REMOVE} , orphanRemoval = true )
    @ToString.Exclude
    @Builder.Default
    private List<Appointment> appointments = new ArrayList<>();
}
