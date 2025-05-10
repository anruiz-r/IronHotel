package com.example.demo.room.services;

import com.example.demo.room.repositories.EconomicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EconomicService {
    @Autowired
    private EconomicRepository economicRepository;

}
