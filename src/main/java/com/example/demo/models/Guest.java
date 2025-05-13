package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "guests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest extends User{

    @Column(name = "reservations")
    @OneToMany(mappedBy = "reservedBy", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<Reservation> reservations;
}
