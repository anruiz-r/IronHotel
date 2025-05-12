package com.example.demo.room.controllers;

import com.example.demo.room.models.Economic;
import com.example.demo.room.repositories.EconomicRepository;
import com.example.demo.room.services.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms/economics")
public class EconomicController {
    @Autowired
    private EconomicService economicService;

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
