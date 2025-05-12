package com.example.demo.room.repositories;

import com.example.demo.room.models.EView;
import com.example.demo.room.models.Suite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuiteRepository extends JpaRepository<Suite, Long> {
    List<Suite> findByJacuzziTrue();
    List<Suite> findByView(EView view);
}

