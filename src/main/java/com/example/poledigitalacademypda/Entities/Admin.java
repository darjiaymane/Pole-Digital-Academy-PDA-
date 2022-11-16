package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Admin extends User {
}
