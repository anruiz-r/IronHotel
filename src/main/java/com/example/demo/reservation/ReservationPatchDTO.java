package com.example.demo.reservation;

import com.example.demo.room.models.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationPatchDTO {

    private LocalDate arrivalDate;
    private LocalDate departureDate;

    @Enumerated(EnumType.STRING)
    private EReservationState ReservationState;

}
