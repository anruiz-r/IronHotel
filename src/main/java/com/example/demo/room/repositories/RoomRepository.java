package com.example.demo.room.repositories;

import com.example.demo.room.models.EBed;
import com.example.demo.room.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository <Room, Long>{
    List<Room> findAll();
    List<Room> findByAvailableTrue();
    List<Room> findByBedType(EBed bedType);
    void deleteById(Long id);

}
