package com.ua.robot.rest;

import com.ua.robot.domain.Country;
import com.ua.robot.dto.CountryDto;
import com.ua.robot.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/countries")
    public ResponseEntity<List<CountryDto>> findAll() {
        return ResponseEntity.ok(countryService.findAll());
    }

    @PostMapping("/countries")
    public ResponseEntity<Void> save(@RequestBody Country country){
        countryService.save(country);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}