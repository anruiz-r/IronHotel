package com.example.demo.room.controllers;

import com.example.demo.room.models.Economic;
import com.example.demo.room.models.Room;
import com.example.demo.room.models.Suite;
import com.example.demo.room.services.RoomService;
import com.example.demo.room.services.SuiteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rooms/suites")
public class SuiteController {
    @Autowired
    private SuiteService suiteService;

    @Autowired
    private RoomService roomService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Suite createSuiteRoom(@RequestBody Suite newRoom){
        return (Suite) roomService.createRoom(newRoom);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Suite updateSuite(@PathVariable Long roomId, @RequestBody @Valid Suite room) {
        return suiteService.updateSuite(roomId, room);
    }

}
