package com.example.demo.reservation;

import com.example.demo.room.models.Room;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @Column(nullable = false )
    private LocalDate arrivalDate;

    @Column(nullable = false )
    private LocalDate departureDate;

    @Column(nullable = false )
    private int pax;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EReservationState ReservationState;

    @ManyToOne
    @JoinColumn(name = "reservation_room", referencedColumnName = "room_id")
    private Room roomReserved;

    @ManyToOne
    @JoinColumn(name = "reservation_guest", referencedColumnName = "guest_id")
    private Guest reservedByGuest;

    @ManyToOne
    @JoinColumn(name = "reservation_employee", referencedColumnName = "employee_id")
    private Employee createdByEmployee;

    @Column(nullable = false )
    private LocalDateTime creationDate;
}
