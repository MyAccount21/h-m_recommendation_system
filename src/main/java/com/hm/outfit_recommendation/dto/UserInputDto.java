package com.hm.outfit_recommendation.dto;

import com.hm.outfit_recommendation.model.Event;
import com.hm.outfit_recommendation.model.Season;
import com.hm.outfit_recommendation.model.Style;
import com.hm.outfit_recommendation.model.UserInputCategory;
import lombok.Data;

import java.util.Set;

@Data
public class UserInputDto {
    private Style style;
    private Season season;
    private Event event;
    private Set<UserInputCategory> userInputCategories;
}
