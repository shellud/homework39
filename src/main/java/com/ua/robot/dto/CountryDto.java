package com.ua.robot.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
public class CountryDto {

    private Long id;

    private String name;

    private List<String> cities;
}