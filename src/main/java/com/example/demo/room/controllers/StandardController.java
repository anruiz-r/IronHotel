package com.example.demo.room.controllers;

import com.example.demo.room.services.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms/standards")
public class StandardController {
    @Autowired
    private StandardService standardService;
}
