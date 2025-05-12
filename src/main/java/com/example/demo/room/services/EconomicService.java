package com.example.demo.room.services;

import com.example.demo.room.models.Economic;
import com.example.demo.room.models.Room;
import com.example.demo.room.repositories.EconomicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public Economic updateEconomicRoom(Long id, Economic room ) {
        Economic existingRoom = economicRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        room.setRoomId(existingRoom.getRoomId());
        room.setRoomNumber(existingRoom.getRoomNumber());
        room.setAvailable(existingRoom.isAvailable());
        room.setPrice(existingRoom.getPrice());
        room.setFloor(existingRoom.getFloor());
        room.setCapacity(existingRoom.getCapacity());
        room.setState(existingRoom.getState());
        room.setIncludedBreakfast(existingRoom.isIncludedBreakfast());
        room.setBathroom(existingRoom.getBathroom());
        return economicRepository.save(room);
    }

}
