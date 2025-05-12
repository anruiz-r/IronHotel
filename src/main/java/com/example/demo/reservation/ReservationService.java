package com.example.demo.reservation;

import com.example.demo.room.models.Room;
import com.example.demo.users.models.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    //POST
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    //GET

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<Reservation> findReservationsByDepartureDate(LocalDate departureDate) {
        return reservationRepository.findByDepartureDate(departureDate);
    }

    public List<Reservation> findReservationsByArrivalDate(LocalDate arrivalDate) {
        return reservationRepository.findByArrivalDate(arrivalDate);
    }

    public List<Reservation> findReservationsByRoom(Room room) {
        return reservationRepository.findByRoomReserved(room);
    }

    public List<Reservation> findReservationsByGuest(Guest guest) {
        return reservationRepository.findByReservedByGuest(guest);
    }

    public List<Reservation> getReservationsByState(EReservationState state) {
        return reservationRepository.findByReservationState(state);
    }

    //PATCH
    public Reservation modifyReservation(Long reservationId, ReservationPatchDTO reservationPatchDTO) {
        Reservation existingReservation= reservationRepository.findById(reservationId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (reservationPatchDTO.getReservationState() != null) {
            existingReservation.setReservationState(reservationPatchDTO.getReservationState());
        }
        if (reservationPatchDTO.getArrivalDate() != null) {
         existingReservation.setArrivalDate(reservationPatchDTO.getArrivalDate());
        }
        if (reservationPatchDTO.getDepartureDate() != null) {
            existingReservation.setDepartureDate(reservationPatchDTO.getDepartureDate());
        }
        return reservationRepository.save(existingReservation);
    }

    //CANCEL RESERVATION (guest & employee)
    public Reservation cancelReservation(long reservationId) {
        Reservation existingReservation = reservationRepository.findById(reservationId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        existingReservation.setReservationState(EReservationState.CANCELLED);
        return reservationRepository.save(existingReservation);
    }

    //COMPLETELY DELETE RES (solo admin)
    public void deleteReservation(long reservationId) {
        reservationRepository.deleteById(reservationId);
    }


    public boolean isRoomAvailable(Room room, LocalDate arrivalDate, LocalDate departureDate) {
        List<Reservation> reservations = reservationRepository.findByRoomReserved(room);

        for (Reservation eachRes : reservations) {
            if (arrivalDate.isBefore(eachRes.getDepartureDate()) && departureDate.isAfter(eachRes.getArrivalDate())) {
                return false;
            }
        }
        return true;
    }

}
