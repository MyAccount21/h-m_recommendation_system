package com.hm.outfit_recommendation.repository;

import com.hm.outfit_recommendation.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import java.math.BigDecimal;

@Repository
public class FakeClothingItemRepository implements ClothingItemRepository {

    List<ClothingItem> clothingItems;

    FakeClothingItemRepository () {
        clothingItems = new ArrayList<>();
        initializeClothingItems();
    }

    private void initializeClothingItems() {
        clothingItems.add(new ClothingItem(1, "T-Shirt", 10, new BigDecimal("19.99"),
                Set.of(Event.NORMAL_DAY), Set.of(Season.SPRING, Season.SUMMER),
                Set.of(Style.CASUAL, Style.STREETWEAR), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(2, "Jeans", 15, new BigDecimal("49.99"),
                Set.of(Event.CLUBBING, Event.CONCERT), Set.of(Season.SUMMER),
                Set.of(Style.CASUAL), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(3, "Winter Coat", 5, new BigDecimal("99.99"),
                Set.of(Event.CHRISTMAS, Event.GALA), Set.of(Season.WINTER),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(4, "Sneakers", 20, new BigDecimal("59.99"),
                Set.of(Event.CLUBBING, Event.CONCERT), Set.of(Season.SUMMER, Season.SPRING),
                Set.of(Style.ATHLEISURE), Category.SHOES));

        clothingItems.add(new ClothingItem(5, "Dress Shirt", 8, new BigDecimal("39.99"),
                Set.of(Event.WEDDING, Event.GALA), Set.of(Season.WINTER, Season.SPRING),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(6, "Scarf", 12, new BigDecimal("29.99"),
                Set.of(Event.CHRISTMAS, Event.DINNER), Set.of(Season.WINTER),
                Set.of(Style.CASUAL), Category.ACCESSORIES));

        clothingItems.add(new ClothingItem(7, "Running Shorts", 25, new BigDecimal("24.99"),
                Set.of(Event.NORMAL_DAY), Set.of(Season.SUMMER),
                Set.of(Style.ATHLEISURE), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(9, "Sweater", 10, new BigDecimal("39.99"),
                Set.of(Event.CHRISTMAS), Set.of(Season.WINTER),
                Set.of(Style.CASUAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(10, "Leather Jacket", 6, new BigDecimal("149.99"),
                Set.of(Event.CLUBBING, Event.CONCERT), Set.of(Season.AUTUMN, Season.WINTER),
                Set.of(Style.STREETWEAR), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(11, "Blazer", 7, new BigDecimal("89.99"),
                Set.of(Event.GALA, Event.GRADUATION), Set.of(Season.SPRING, Season.WINTER),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(12, "Cap", 25, new BigDecimal("19.99"),
                Set.of(Event.CLUBBING, Event.CONCERT), Set.of(Season.SUMMER),
                Set.of(Style.STREETWEAR), Category.ACCESSORIES));

        clothingItems.add(new ClothingItem(13, "Cargo Pants", 10, new BigDecimal("49.99"),
                Set.of(Event.CLUBBING, Event.DINNER), Set.of(Season.SUMMER),
                Set.of(Style.STREETWEAR), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(14, "Vest", 12, new BigDecimal("29.99"),
                Set.of(Event.WEDDING, Event.GALA), Set.of(Season.SPRING),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(15, "Hoodie", 18, new BigDecimal("34.99"),
                Set.of(Event.NORMAL_DAY), Set.of(Season.AUTUMN, Season.WINTER),
                Set.of(Style.CASUAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(16, "Suit", 4, new BigDecimal("199.99"),
                Set.of(Event.WEDDING, Event.GALA), Set.of(Season.AUTUMN),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(17, "Dress", 5, new BigDecimal("89.99"),
                Set.of(Event.WEDDING, Event.GRADUATION), Set.of(Season.SPRING, Season.AUTUMN),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(18, "Skirt", 20, new BigDecimal("39.99"),
                Set.of(Event.DINNER, Event.BIRTHDAY), Set.of(Season.SUMMER),
                Set.of(Style.CASUAL), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(19, "Sweatpants", 15, new BigDecimal("24.99"),
                Set.of(Event.NORMAL_DAY), Set.of(Season.WINTER),
                Set.of(Style.ATHLEISURE), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(20, "Turtleneck", 10, new BigDecimal("49.99"),
                Set.of(Event.DINNER, Event.GALA), Set.of(Season.WINTER),
                Set.of(Style.FORMAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(21, "Flannel Shirt", 8, new BigDecimal("29.99"),
                Set.of(Event.CHRISTMAS, Event.NORMAL_DAY), Set.of(Season.AUTUMN),
                Set.of(Style.CASUAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(22, "Chinos", 12, new BigDecimal("54.99"),
                Set.of(Event.GRADUATION, Event.DINNER), Set.of(Season.SPRING, Season.AUTUMN),
                Set.of(Style.CASUAL), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(23, "Boots", 6, new BigDecimal("89.99"),
                Set.of(Event.NORMAL_DAY), Set.of(Season.WINTER),
                Set.of(Style.CASUAL), Category.SHOES));

        clothingItems.add(new ClothingItem(24, "Sandals", 25, new BigDecimal("24.99"),
                Set.of(Event.NORMAL_DAY, Event.CHRISTMAS), Set.of(Season.SUMMER),
                Set.of(Style.CASUAL), Category.SHOES));

        clothingItems.add(new ClothingItem(25, "Tank Top", 30, new BigDecimal("19.99"),
                Set.of(Event.BIRTHDAY, Event.CLUBBING), Set.of(Season.SUMMER),
                Set.of(Style.CASUAL), Category.UPPER_BODY));

        clothingItems.add(new ClothingItem(26, "Oxford shoes", 30, new BigDecimal("19.99"),
                Set.of(Event.WEDDING, Event.CLUBBING), Set.of(Season.WINTER),
                Set.of(Style.FORMAL), Category.SHOES));

        clothingItems.add(new ClothingItem(27, "Tie", 30, new BigDecimal("49.99"),
                Set.of(Event.WEDDING), Set.of(Season.WINTER, Season.AUTUMN, Season.SPRING),
                Set.of(Style.FORMAL), Category.ACCESSORIES));

        clothingItems.add(new ClothingItem(28, "Trousers", 2, new BigDecimal("79.99"),
                Set.of(Event.WEDDING), Set.of(Season.WINTER, Season.AUTUMN, Season.SPRING),
                Set.of(Style.FORMAL), Category.LOWER_BODY));

        clothingItems.add(new ClothingItem(28, "Italian lether shoes", 2, new BigDecimal("299.99"),
                Set.of(Event.WEDDING), Set.of(Season.WINTER, Season.AUTUMN, Season.SPRING),
                Set.of(Style.FORMAL), Category.SHOES));
    }

    @Override
    public Collection<ClothingItem> getAll() {
        return clothingItems;
    }

    @Override
    public List<ClothingItem> filterBy(Category category, Event event, Style style, Season season, BigDecimal budget) {
        return clothingItems
                .stream()
                .filter(clothingItem -> clothingItem.getCategory() == category)
                .filter(clothingItem -> clothingItem.getEvents().contains(event))
                .filter(clothingItem -> clothingItem.getStyles().contains(style))
                .filter(clothingItem -> clothingItem.getSeasons().contains(season))
                .filter(clothingItem -> clothingItem.getPrice().compareTo(budget) <= 0)
                .toList();
    }
}
