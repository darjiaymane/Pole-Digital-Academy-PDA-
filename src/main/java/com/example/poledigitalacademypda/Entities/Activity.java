package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String title;
    @Column
    private String description;

    @ManyToOne @JoinColumn(name = "manager_id",referencedColumnName = "id")
    private Manager manager;
    @Column
    private Boolean status;

}
