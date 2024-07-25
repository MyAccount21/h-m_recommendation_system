package com.hm.outfit_recommendation.service;

import com.hm.outfit_recommendation.model.*;
import com.hm.outfit_recommendation.repository.ClothingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    @Autowired
    ClothingItemRepository clothingItemRepository;

    @Override
    public List<List<ClothingItem>> findItemsThatSatisfyUserInput(UserInput userInput) {
        Season season = userInput.getSeason();
        Event event = userInput.getEvent();
        Style style = userInput.getStyle();

        List<List<ClothingItem>> clothingItemByCategory = userInput.getUserInputCategories().stream()
                .map(userInputCategory -> clothingItemRepository.filterBy(
                        userInputCategory.getCategory(),
                        event,
                        style,
                        season,
                        userInputCategory.getBudgetInEuros()
                ))
                .collect(Collectors.toList());

        return clothingItemByCategory;
      }

    @Override
    public List<CategoryRecommendation> createRecommendations(UserInput userInput) {
        var clothingItemsByCategory = findItemsThatSatisfyUserInput(userInput);
        return createRecommendationFromCategories(clothingItemsByCategory);
    }

    /**
     *
     * @param filteredClothingItemsByCategory all the clothing item for each category that fulfills the criterion
     * @return randomly selected, only one item from each category of available clothing items
     */
    private List<CategoryRecommendation> createRecommendationFromCategories(List<List<ClothingItem>> filteredClothingItemsByCategory) {
        List<CategoryRecommendation> categoryRecommendations = new ArrayList<>();

        for(List<ClothingItem> clothingItem : filteredClothingItemsByCategory) {
            if(clothingItem.size() != 0) {
                CategoryRecommendation categoryRecommendation = new CategoryRecommendation();
                categoryRecommendation.setId(Math.abs(new Random().nextInt()));

                int randomNumberSmallerThenSize = new Random().nextInt(clothingItem.size());
                int absValueOfRandom = Math.abs(randomNumberSmallerThenSize);

                categoryRecommendation.setClothingItem(clothingItem.get(absValueOfRandom));
                categoryRecommendations.add(categoryRecommendation);
            }
        }
        return categoryRecommendations;
    }
}
