package com.example.demo.room.services;

import com.example.demo.room.models.Economic;
import com.example.demo.room.repositories.EconomicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomicService {
    @Autowired
    private EconomicRepository economicRepository;

    public List<Economic> GetAllEconomicsRooms() {
        return economicRepository.findAll();
    }

   public  List<Economic> findByIncludedBreakfastTrue(){
        return economicRepository.findByIncludedBreakfastTrue();
   }

}
