package com.snackhubmenu.domain.menu;

import com.snackhubmenu.domain.Entity;

import java.math.BigDecimal;
import java.util.List;

public class ItemMenu extends Entity<ItemMenuId> {

    private final String name;
    private final BigDecimal price;
    private final ItemMenuCategory category;
    private final List<Ingredient> ingredients;

    public ItemMenu(ItemMenuId id, String name, BigDecimal price, ItemMenuCategory category, List<Ingredient> ingredients) {
        super(id);
        this.name = name;
        this.price = price;
        this.category = category;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemMenuCategory getCategory() {
        return category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
