package com.example.demo.repositories;

import com.example.demo.models.EView;
import com.example.demo.models.Suite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuiteRepository extends JpaRepository<Suite, Long> {
    List<Suite> findByJacuzziTrue();
    List<Suite> findByView(EView view);
}

