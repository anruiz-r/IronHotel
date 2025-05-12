package com.example.demo.room.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Room {
    @Column(name = "room-id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private int floor;

    @Column(name = "room-number", nullable = false, unique = true)
    private int roomNumber;

    @Column(nullable = false)
    private boolean available;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ERoomState state;

    @Column(name = "bed-type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EBed bedType;

//    @OneToMany(mappedBy = "roomReserved", cascade = CascadeType.ALL, orphanRemoval = true) //esto hará que si se elimina una habitacion sus reservas no se queden colgadas y se eliminen tambien
//    private List<Reservation> reservations;

}
