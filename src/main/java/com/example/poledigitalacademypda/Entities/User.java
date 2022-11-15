package com.example.poledigitalacademypda.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String password;
    @OneToOne
    private Role role;

    public User(String fname, String lname, String email, String phone, String password, Role role) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }


}
