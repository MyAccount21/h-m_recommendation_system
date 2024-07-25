package com.hm.outfit_recommendation.repository;

import com.hm.outfit_recommendation.model.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public interface ClothingItemRepository {
    Collection<ClothingItem> getAll();
    List<ClothingItem> filterBy(Category category, Event event, Style style, Season season, BigDecimal budget);
}
