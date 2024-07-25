package com.hm.outfit_recommendation.service;

import com.hm.outfit_recommendation.model.CategoryRecommendation;
import com.hm.outfit_recommendation.model.ClothingItem;
import com.hm.outfit_recommendation.model.UserInput;

import java.util.List;

public interface RecommendationService {
    /**
     *
     * @param userInput which includes criteria such as: style, event type, budget for each category(categories could be:
     *                  upper body part, lower body part, shoes and accessories) and other criteria
     * @return list of list in which each list consists of all the items that fulfill the criterion
     */
    List<List<ClothingItem>> findItemsThatSatisfyUserInput(UserInput userInput);

    /**
     *
     * @param userInput which includes criteria such as: style, event type, budget for each category(categories could be:
     *                  upper body part, lower body part, shoes and accessories) and other criteria
     *
     * @return list of category recommendations for each category that fulfill all the criteria. If no clothing item fulfilled the criterion,
     * that it is not included in the list. One category gets one clothing item as category recommendation at most.
     */
    List<CategoryRecommendation> createRecommendations(UserInput userInput);
}
