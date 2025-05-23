package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Column(name = "room_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private int floor;

    @Column(name = "room_number", nullable = false, unique = true)
    private int roomNumber;

    @Column(nullable = false)
    private boolean available;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ERoomState state;

    @Column(name = "bed_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EBed bedType;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true) //esto hará que si se elimina una habitacion sus reservas no se queden colgadas y se eliminen tambien
    @JsonBackReference
    private List<Reservation> reservations;

}
