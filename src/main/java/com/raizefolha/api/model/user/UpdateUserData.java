package com.raizefolha.api.model.user;

import jakarta.validation.constraints.NotNull;

public record UpdateUserData (
    
    @NotNull Long id,
    String email,
    String password,
    String telephone

){}
