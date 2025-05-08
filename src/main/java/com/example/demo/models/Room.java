package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "rooms")
@Data
@AllArgsConstructor
public abstract class Room {
    @Id
    @GeneratedValue
    private long roomId;

    @Column
    @NotNull
    private double price;

    @Column
    private int capacity;

    @Column
    private int floor;

    @Column
    private int roomNumber;

    @Column
    private boolean available;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private ERoomState state;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private EBed bed;

    public Room() {
        this.capacity = 1;
        this.available = true;
    }
}
