package com.example.demo.controllers;


import com.example.demo.models.Standard;
import com.example.demo.services.RoomService;
import com.example.demo.services.StandardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/rooms/standards")
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

    @PutMapping("/{roomId}")
    @ResponseStatus(HttpStatus.OK)
    public Standard updateStandardRoom(@PathVariable Long roomId, @RequestBody @Valid Standard room) {
        return standardService.updateStandardRoom(roomId, room);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Standard> findAllRooms(){
        return standardService.findAll();
    }

}
