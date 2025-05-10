package com.example.demo.room.controllers;

import com.example.demo.room.services.SuiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms/suites")
public class SuiteController {
    @Autowired
    private SuiteService suiteService;
}
