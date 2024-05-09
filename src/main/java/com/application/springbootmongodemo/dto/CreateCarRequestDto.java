package com.application.springbootmongodemo.dto;

public record CreateCarRequestDto(
        String manufacturer,
        String model,
        int year
) {
}
