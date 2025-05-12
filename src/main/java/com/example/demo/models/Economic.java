package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "economic")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Economic extends Room{
    @Column(nullable = false)
    private boolean includedBreakfast;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EBathroom bathroom = EBathroom.SHOWER;
}
