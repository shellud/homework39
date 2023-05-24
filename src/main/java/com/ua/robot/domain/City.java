package com.ua.robot.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private int population;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}