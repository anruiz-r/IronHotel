//package com.example.demo.controllers;
//
//import com.example.demo.models.Admin;
//import com.example.demo.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api/public/admin")
//public class AdminController  {
//
//    @Autowired
//    UserService userService;
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
////    public Admin createEmployee(@RequestBody @Valid Admin newAdmin) {
////        return (Admin) userService.saveUser(newAdmin);
////    }
//    public Admin createEmployee(@RequestBody  Admin newAdmin) {
//        return (Admin) userService.saveUser(newAdmin);
//    }
//
//}