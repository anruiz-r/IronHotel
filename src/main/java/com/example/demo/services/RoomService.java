package com.example.demo.services;

import com.example.demo.models.EBed;
import com.example.demo.models.Room;
import com.example.demo.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(Room newRoom ){
        return roomRepository.save(newRoom);
    }

    public Room updateRoom(Long id, Room room ) {
        Room existingRoom = roomRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        room.setRoomId(existingRoom.getRoomId());
        room.setRoomNumber(existingRoom.getRoomNumber());
        room.setAvailable(existingRoom.isAvailable());
        room.setPrice(existingRoom.getPrice());
        room.setFloor(existingRoom.getFloor());
        room.setCapacity(existingRoom.getCapacity());
        room.setState(existingRoom.getState());
        return roomRepository.save(room);
    }

    public List<Room>  getRoomsByBedType(EBed bedType){
        return roomRepository.findByBedType(bedType);
    }

    public List<Room> findByAvailableTrue(){
        return roomRepository.findByAvailableTrue();
    }

    public List<Room>  findAll(){
        return roomRepository.findAll();
    }

    public void deleteById(Long roomId){
       roomRepository.deleteById(roomId);
    }

}
