package com.example.demo.models;
import com.example.demo.models.EReservationState;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Column(name = "reservation_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @Column(name = "arrival_date", nullable = false )
    private LocalDate arrivalDate;

    @Column(name = "departure_date", nullable = false )
    private LocalDate departureDate;

    @Column(nullable = false )
    private int pax;

    @Column(name = "reservation_state", nullable = false)
    @Enumerated(EnumType.STRING)
    private EReservationState reservationState;

    @ManyToOne
    @JoinColumn(name = "reservation_room", referencedColumnName = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "reservation_guest", referencedColumnName = "id")
    private Guest reservedBy;

    @ManyToOne
    @JoinColumn(name = "reservation_employee", referencedColumnName = "id")
    private Employee createdBy;

    @Column(name = "creation_date", nullable = false )
    private LocalDateTime creationDate;
}
