package com.example.demo.room.controllers;

import com.example.demo.room.repositories.EconomicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms/economics")
public class EconomicController {
    @Autowired
    private EconomicRepository economicRepository;
}
