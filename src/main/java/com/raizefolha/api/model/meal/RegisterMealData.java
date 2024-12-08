package com.raizefolha.api.model.meal;

import jakarta.validation.constraints.NotBlank;

public record RegisterMealData (

    @NotBlank String name,
    @NotBlank Double price,
    @NotBlank String description

) {}
