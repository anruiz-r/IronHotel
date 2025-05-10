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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private int floor;

    @Column(nullable = false)
    private int roomNumber;

    @Column(nullable = false)
    private boolean available;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ERoomState state;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EBed bedType;

}
