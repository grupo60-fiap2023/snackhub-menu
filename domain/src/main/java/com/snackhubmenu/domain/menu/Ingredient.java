package com.snackhubmenu.domain.menu;

import com.snackhubmenu.domain.Entity;
import com.snackhubmenu.domain.validation.ValidationHandler;

public class Ingredient extends Entity<IngredientId> {

    private final String name;

    private final Double quantity;

    public Ingredient(IngredientId id, String name, Double quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }
}
