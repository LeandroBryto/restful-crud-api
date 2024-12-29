package com.example.restful_crud_api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductController(@NotBlank String name, @NotNull BigDecimal value) {
}
