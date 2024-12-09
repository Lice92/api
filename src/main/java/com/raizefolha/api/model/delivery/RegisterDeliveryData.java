package com.raizefolha.api.model.delivery;

import com.raizefolha.api.model.address.AddressData;
import com.raizefolha.api.model.meal.RegisterMealData;
import com.raizefolha.api.model.user.RegisterUserData;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record RegisterDeliveryData (

    @NotBlank @Valid RegisterUserData user,
    @NotBlank @Valid RegisterMealData meal,
    @NotBlank @Valid AddressData address,
    @NotBlank String comentary

) {}
