package com.example.demo.repositories;

import com.example.demo.models.EBed;
import com.example.demo.models.Room;
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
