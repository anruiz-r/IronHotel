package com.example.demo.room.controllers;


import com.example.demo.room.models.Economic;
import com.example.demo.room.models.Room;
import com.example.demo.room.models.Standard;
import com.example.demo.room.services.RoomService;
import com.example.demo.room.services.StandardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rooms/standards")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @Autowired
    private RoomService roomService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Standard createStandardRoom(@RequestBody Standard newRoom){
        return (Standard) roomService.createRoom(newRoom);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Standard updateStandardRoom(@PathVariable Long roomId, @RequestBody @Valid Standard room) {
        return standardService.updateStandardRoom(roomId, room);
    }
}
