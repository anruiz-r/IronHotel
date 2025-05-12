package com.example.demo.controllers;

import com.example.demo.models.EBed;
import com.example.demo.models.Room;
import com.example.demo.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Room> findAllRooms(){
        return roomService.findAll();
    }

    @GetMapping("bed-type/{bedType}")
    @ResponseStatus(HttpStatus.OK)
    public List<Room> getByBedType(@PathVariable EBed bedType) {
        return roomService.getRoomsByBedType(bedType);
    }

    @GetMapping("/available-rooms")
    @ResponseStatus(HttpStatus.OK)
    public List<Room> getAvailableRooms() {
        return roomService.findByAvailableTrue();
    }

    @DeleteMapping("/{roomId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRoom(Long roomId){
        roomService.deleteById(roomId);
    }

}