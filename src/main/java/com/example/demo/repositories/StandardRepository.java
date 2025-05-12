package com.example.demo.repositories;

import com.example.demo.models.EBathroom;
import com.example.demo.models.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StandardRepository extends JpaRepository<Standard, Long> {
    List<Standard> findByMinibarTrue();
    List<Standard> findByBathroom(EBathroom bathroom);
}
