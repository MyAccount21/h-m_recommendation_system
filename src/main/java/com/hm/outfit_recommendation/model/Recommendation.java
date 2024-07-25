package com.hm.outfit_recommendation.model;

import lombok.Data;

import java.util.List;

@Data
public class Recommendation {
    private UserInput userInput;
    private List<CategoryRecommendation> recommendations;
}
