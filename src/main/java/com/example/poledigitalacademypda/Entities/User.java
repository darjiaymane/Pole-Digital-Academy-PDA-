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
    @Column
    private String domaine;
    @Column
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    public User(String fname, String lname, String email, String phone, String password, Role role) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", domaine='" + domaine + '\'' +
                ", status=" + status +
                ", role=" + role +
                '}';
    }
}
