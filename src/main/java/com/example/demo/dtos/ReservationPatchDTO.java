package com.example.demo.dtos;

import com.example.demo.models.EReservationState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationPatchDTO {

    private LocalDate arrivalDate;
    private LocalDate departureDate;

    @Enumerated(EnumType.STRING)
    private EReservationState ReservationState;

}
