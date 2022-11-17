package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Participant")
public class Participant extends User implements Serializable {
    @Column
    private  String Structure;

    @Override
    public String toString() {
        return "Participant{" + super.toString()+
                "Structure='" + Structure + '\'' +
                '}';
    }
}
