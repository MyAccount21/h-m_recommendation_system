package com.hm.outfit_recommendation.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class UserInput {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private User user;
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Date date;
    private Style style;
    private Season season;
    private Event event;
    private Set<UserInputCategory> userInputCategories;
}
