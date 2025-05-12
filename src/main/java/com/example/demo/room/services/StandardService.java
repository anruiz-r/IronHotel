package com.example.demo.room.services;

import com.example.demo.room.repositories.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StandardService {
    @Autowired
    private StandardRepository standardRepository;

}
