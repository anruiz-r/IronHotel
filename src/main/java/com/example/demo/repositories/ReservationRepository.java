package com.example.demo.repositories;

import com.example.demo.models.EReservationState;
import com.example.demo.models.Reservation;
import com.example.demo.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByArrivalDate(LocalDate arrivalDate);
    List<Reservation> findByDepartureDate(LocalDate departureDate);
    List<Reservation> findByArrivalDateAndDepartureDate(LocalDate arrivalDate, LocalDate departureDate);
    List<Reservation> findByCreationDate(LocalDateTime creationDate);
//    List<Reservation> findByCreatedByEmployee(Employee createdByEmployee);
//    List<Reservation> findByReservedByGuest(Guest reservedByGuest);
    List<Reservation> findByRoom(Room room);
    List<Reservation> findByReservationState(EReservationState state);
}
