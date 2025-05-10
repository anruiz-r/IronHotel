package com.example.demo.room.services;

import com.example.demo.room.repositories.SuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuiteService {
    @Autowired
    private SuiteRepository suiteRepository;

}
