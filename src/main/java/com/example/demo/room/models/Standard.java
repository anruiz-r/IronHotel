package com.example.demo.room.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "standard")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Standard extends Room{
    @Column(nullable = false)
    private boolean minibar;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EBathroom bathroom ;
}
