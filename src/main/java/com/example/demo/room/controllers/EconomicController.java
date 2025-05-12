package com.example.demo.room.controllers;

import com.example.demo.room.models.Economic;
import com.example.demo.room.models.Room;
import com.example.demo.room.repositories.EconomicRepository;
import com.example.demo.room.services.EconomicService;
import com.example.demo.room.services.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/public/rooms/economics")
public class EconomicController {
    @Autowired
    private EconomicService economicService;

    @Autowired
    private RoomService roomService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Economic createEconomicRoom(@RequestBody @Valid Economic newRoom){
        return (Economic) roomService.createRoom(newRoom);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room updateEconomicRoom(@PathVariable Long roomId, @RequestBody @Valid Economic room) {
        return economicService.updateEconomicRoom(roomId, room);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Economic> findAllEconomicRooms(){
      return economicService.GetAllEconomicsRooms();
    }
    @GetMapping("/withBreakfastIncluded")
    @ResponseStatus(HttpStatus.OK)

    public List<Economic> getEconomicRoomsWithBreakfast(){
        return economicService.findByIncludedBreakfastTrue();
    }

}
