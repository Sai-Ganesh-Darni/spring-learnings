package com.learning.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "bio")
    private String bio;

    @Column(nullable = false, name = "phone_number")
    private String phone_number;

    @Column(nullable = false, name = "date_of_birth")
    private LocalDate date_of_birth;

    @Column(nullable = false, name = "loyalty_points")
    private Integer loyalty_points;

}
