package com.example.demo.users.models;

import com.example.demo.reservation.Reservation;
import com.example.demo.users.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column
    private String position;
    @Column(name = "reservations_created")
    @OneToMany(mappedBy = "created_by", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservationsCreated;
}