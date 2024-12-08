package com.raizefolha.api.model.meal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<MealModel, Long> {
    
}
