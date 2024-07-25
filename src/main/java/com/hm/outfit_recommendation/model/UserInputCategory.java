package com.hm.outfit_recommendation.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserInputCategory {
    private Category category;
    private BigDecimal budgetInEuros;
}
