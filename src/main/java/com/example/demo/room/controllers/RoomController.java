package com.example.demo.room.controllers;

import com.example.demo.room.models.EBed;
import com.example.demo.room.models.Room;
import com.example.demo.room.services.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room createRoom(@RequestBody Room newRoom){
        return roomService.createRoom(newRoom);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room updateRoom(@PathVariable Long roomId, @RequestBody @Valid Room room) {
        return roomService.updateRoom(roomId, room);
    }

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

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRoom(Long roomId){
        roomService.deleteById(roomId);
    }


}