//package com.example.demo.models;
//
//import com.example.demo.reservation.Reservation;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//
//@Entity
//@Table(name = "guests")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Guest extends User{
//
//    @Column(name = "guest_id")
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long guestId;
//
//    @Column(name = "reservations")
//    @OneToMany(mappedBy = "reserved_by", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Reservation> reservations;
//}
