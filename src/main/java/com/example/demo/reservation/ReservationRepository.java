package com.example.demo.reservation;

import com.example.demo.room.models.Room;
import com.example.demo.models.Employee;
import com.example.demo.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByArrivalDate(LocalDate arrivalDate);
    List<Reservation> findByDepartureDate(LocalDate departureDate);
    List<Reservation> findByArrivalDateAndDepartureDate(LocalDate arrivalDate, LocalDate departureDate);
    List<Reservation> findByCreationDate(LocalDate creationDate);
    List<Reservation> findByCreatedByEmployee(Employee createdByEmployee);
    List<Reservation> findByReservedByGuest(Guest reservedByGuest);
    List<Reservation> findByRoomReserved(Room roomReserved);
    List<Reservation> findByReservationState(EReservationState state);
}
