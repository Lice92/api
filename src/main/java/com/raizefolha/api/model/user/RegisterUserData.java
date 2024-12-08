package com.raizefolha.api.model.user;

import jakarta.validation.constraints.*;

public record RegisterUserData (

    @NotBlank String name,
    @NotBlank @Email String email,
    @NotBlank String password,
    @NotBlank String telephone

) {}
