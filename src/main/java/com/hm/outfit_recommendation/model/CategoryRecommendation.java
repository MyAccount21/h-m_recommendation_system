package com.hm.outfit_recommendation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Recommendation for specific category. Categories are for example upper-body, shoes etc.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRecommendation {
    private long id;
    private ClothingItem clothingItem;
}
