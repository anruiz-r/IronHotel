package com.example.demo.controllers;

import com.example.demo.models.Suite;
import com.example.demo.services.RoomService;
import com.example.demo.services.SuiteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/rooms/suites")
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

    @PutMapping("/{roomId}")
    @ResponseStatus(HttpStatus.OK)
    public Suite updateSuite(@PathVariable Long roomId, @RequestBody @Valid Suite room) {
        return suiteService.updateSuite(roomId, room);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Suite> findAllRooms(){
        return suiteService.findAll();
    }

}
