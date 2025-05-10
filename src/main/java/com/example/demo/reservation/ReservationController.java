package com.example.demo.reservation;

import com.example.demo.room.models.Room;
import com.example.demo.room.services.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
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

        boolean isAvailable= reservationService.isRoomAvailable(newReservation.getRoomReserved(), newReservation.getArrivalDate(), newReservation.getDepartureDate());
        if (!isAvailable) {
                throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "No rooms available in selected dates");
            }
            return reservationService.createReservation(newReservation);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation modifyReservation(@PathVariable Long reservationId, @RequestBody ReservationPatchDTO reservationDTO) {
        return reservationService.modifyReservation(reservationId, reservationDTO);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public void cancelReservation(Long reservationId) {
        reservationService.cancelReservation(reservationId);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReservation(Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> findAllReservations(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation findReservationById(@PathVariable Long reservationId){
        return reservationService.getReservationById(reservationId);
    }

    @GetMapping("/arrival/{date}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> getReservationsByArrivalDate(@PathVariable LocalDate arrivalDate) {
        return reservationService.findReservationsByArrivalDate(arrivalDate);
    }

    @GetMapping("/departure/{date}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> getReservationsByDepartureDate(@PathVariable LocalDate departureDate) {
        return reservationService.findReservationsByDepartureDate(departureDate);
    }

    @GetMapping("/guest/{guestId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Reservation> getReservationsByGuest(@PathVariable Long guestId) {
        Guest guest = new Guest();
        guest.setGuestId(guestId);
        return reservationService.findReservationsByGuest(guest);
    }

    @GetMapping("/{state}")
    public List<Reservation> getReservationsByState(@PathVariable EReservationState state) {
        return reservationService.getReservationsByState(state);
    }


    // HAY QUE DARLE UNA VUELTA !!! 🔶🔶🔶🔶

//    @GetMapping("/room/{roomNumber}")
//    public List<Reservation> getReservationsByRoom(@PathVariable Long roomId) {
//        Optional<Room> room = roomService.findByRoomNumber(roomId);
//        return reservationService.findReservationsByRoom(room);
//    }

}

