package com.example.demo.controllers;


import com.example.demo.models.Guest;
import com.example.demo.services.GuestService;
import com.example.demo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/public/guests")
public class GuestController {

    @Autowired
    GuestService guestService;

    @Autowired
    UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Guest createGuest(@RequestBody @Valid Guest newGuest) {
        return (Guest) userService.saveUser(newGuest);
    }

}
