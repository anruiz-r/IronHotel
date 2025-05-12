package com.example.demo.services;

import com.example.demo.models.Standard;
import com.example.demo.repositories.StandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StandardService {
    @Autowired
    private StandardRepository standardRepository;

    public Standard updateStandardRoom(Long id, Standard room ) {
        Standard existingRoom = standardRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        room.setRoomId(existingRoom.getRoomId());
        room.setRoomNumber(existingRoom.getRoomNumber());
        room.setAvailable(existingRoom.isAvailable());
        room.setPrice(existingRoom.getPrice());
        room.setFloor(existingRoom.getFloor());
        room.setCapacity(existingRoom.getCapacity());
        room.setState(existingRoom.getState());
        room.setMinibar(existingRoom.isMinibar());
        room.setBathroom(existingRoom.getBathroom());
        return standardRepository.save(room);
    }

    public List<Standard> findAll(){
        return standardRepository.findAll();
    }


}
