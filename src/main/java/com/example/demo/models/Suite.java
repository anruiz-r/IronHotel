package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "suite")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Suite extends Room{
    @Column(nullable = false)
    private boolean jacuzzi;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EView view;
}