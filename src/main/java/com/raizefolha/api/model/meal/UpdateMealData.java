package com.raizefolha.api.model.meal;

import jakarta.validation.constraints.NotNull;

public record UpdateMealData (

    @NotNull Long id,
    Double price,
    String description

) {}
