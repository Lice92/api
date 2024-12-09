package com.raizefolha.api.model.delivery;

import com.raizefolha.api.model.address.AddressData;
import com.raizefolha.api.model.meal.RegisterMealData;

import jakarta.validation.constraints.NotNull;

public record UpdateDeliveryData (

    @NotNull Long id,
    RegisterMealData meal,
    AddressData address,
    String comentary
    
) {}
