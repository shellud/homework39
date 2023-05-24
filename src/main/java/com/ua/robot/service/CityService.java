package com.ua.robot.service;

import com.ua.robot.domain.City;
import com.ua.robot.dto.CityDto;
import com.ua.robot.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<CityDto> findAll() {
        return cityRepository.findAll().stream().
                map(CityService::buildCityDto).
                collect(Collectors.toList());
    }

    private static CityDto buildCityDto(City city) {
        var countryName = "NO COUNTRY";
        if (city.getCountry() != null) {
            countryName = city.getCountry().getName();
        }

        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .population(city.getPopulation())
                .country(countryName)
                .build();
    }
    public void save(City city) {
        cityRepository.save(city);
    }
}