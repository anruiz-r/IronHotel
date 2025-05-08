package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "rooms")
@Data
@AllArgsConstructor
public class Suite extends Room{
    @Column
    private boolean jacuzzi;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private EView view;

    public Suite (){
        super();
        this.jacuzzi = true;
        this.view = EView.NO_VIEW;
    }
}
