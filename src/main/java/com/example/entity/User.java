package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Scope("prototype")
@Table(name = "users")
public class User {

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false, length = 15)
    private String name;
    @Column(name = "lastName", nullable = false, length = 15)
    private String lastName;
    @Column(name = "age", nullable = false, length = 100)
    private int age;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    public User(String name, String lastName, int age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;

        if (address != null) {
            address.setUser(this);
        }
    }
}
