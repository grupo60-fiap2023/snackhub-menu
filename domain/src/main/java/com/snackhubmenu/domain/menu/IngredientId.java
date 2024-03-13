package com.snackhubmenu.domain.menu;

import com.snackhubmenu.domain.Identifier;

public class IngredientId extends Identifier {

    private final Long value;

    public IngredientId(Long value) {
        this.value = value;
    }

    public static IngredientId from(final Long id) {
        return new IngredientId(id);
    }

    @Override
    public Long getValue() {
        return value;
    }
}
