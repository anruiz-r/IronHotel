package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "rooms")
@Data
@AllArgsConstructor
public class Standard extends Room{
    @Column
    private boolean minibar;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private EBathroom bathroom ;


    public Suite (){
        super();
        this.minibar= false;
    }
}
