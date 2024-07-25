package com.hm.outfit_recommendation.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
public class ClothingItem {
    long id;
    String name;
    int quantity;
    BigDecimal price;
    Set<Event> events;
    Set<Season> seasons;
    Set<Style> styles;
    Category category;

}
