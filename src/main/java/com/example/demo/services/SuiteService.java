package com.example.demo.services;

import com.example.demo.models.Suite;
import com.example.demo.repositories.SuiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SuiteService {
    @Autowired
    private SuiteRepository suiteRepository;

    public Suite updateSuite(Long id, Suite room ) {
        Suite existingRoom = suiteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        room.setRoomId(existingRoom.getRoomId());
        room.setRoomNumber(existingRoom.getRoomNumber());
        room.setAvailable(existingRoom.isAvailable());
        room.setPrice(existingRoom.getPrice());
        room.setFloor(existingRoom.getFloor());
        room.setCapacity(existingRoom.getCapacity());
        room.setState(existingRoom.getState());
        room.setJacuzzi(existingRoom.isJacuzzi());
        room.setView(existingRoom.getView());
        return suiteRepository.save(room);
    }

    public List<Suite> findAll(){
        return suiteRepository.findAll();
    }

}
