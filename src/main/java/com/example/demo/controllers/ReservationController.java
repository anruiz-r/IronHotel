package com.example.demo.controllers;


import com.example.demo.dtos.ReservationPatchDTO;
import com.example.demo.models.EReservationState;
import com.example.demo.models.Reservation;
import com.example.demo.services.ReservationService;
import com.example.demo.services.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/public/reservations")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @Autowired
    RoomService roomService;


//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Reservation createReservation(@RequestBody @Valid Reservation newReservation) {
//        return reservationService.createReservation(newReservation);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation createReservation(@RequestBody @Valid Reservation newReservation) {

        boolean isAvailable= reservationService.isRoomAvailable(newReservation.getRoom(), newReservation.getArrivalDate(), newReservation.getDepartureDate());
        if (!isAvailable) {
                throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "No rooms available in selected dates");
            }
            return reservationService.createReservation(newReservation);
    }

    @PatchMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation modifyReservation(@PathVariable Long reservationId, @RequestBody ReservationPatchDTO reservationDTO) {
        return reservationService.modifyReservation(reservationId, reservationDTO);
    }

    @PatchMapping("/cancel/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public void cancelReservation(@PathVariable Long reservationId) {
        reservationService.cancelReservation(reservationId);
    }

    @DeleteMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReservation(@PathVariable Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> findAllReservations(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation findReservationById(@PathVariable Long reservationId){
        return reservationService.getReservationById(reservationId);
    }

    @GetMapping("/arrival/{arrivalDate}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> getReservationsByArrivalDate(@PathVariable LocalDate arrivalDate) {
        return reservationService.findReservationsByArrivalDate(arrivalDate);
    }

    @GetMapping("/departure/{departureDate}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> getReservationsByDepartureDate(@PathVariable LocalDate departureDate) {
        return reservationService.findReservationsByDepartureDate(departureDate);
    }

//    @GetMapping("/guest/{guestId}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Reservation> getReservationsByGuest(@PathVariable Long guestId) {
//        Guest guest = new Guest();
//        guest.setGuestId(guestId);
//        return reservationService.findReservationsByGuest(guest);
//    }

    @GetMapping("/{state}")
    public List<Reservation> getReservationsByState(@PathVariable EReservationState state) {
        return reservationService.getReservationsByState(state);
    }


    // ¡HAY QUE DARLE UNA VUELTA!!! 🔶🔶🔶🔶

//    @GetMapping("/room/{roomNumber}")
//    public List<Reservation> getReservationsByRoom(@PathVariable Long roomId) {
//        Optional<Room> room = roomService.findByRoomNumber(roomId);
//        return reservationService.findReservationsByRoom(room);
//    }

}

