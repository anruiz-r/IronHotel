package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class GuestController {
   @GetMapping("/bienvenido")
    public String welcome(){
       return "Hola huesped";
   }

}
