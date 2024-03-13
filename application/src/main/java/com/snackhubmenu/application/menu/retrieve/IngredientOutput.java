package com.snackhubmenu.application.menu.retrieve;


import com.snackhubmenu.domain.menu.Ingredient;

public record IngredientOutput(Long id,
                               String name,
                               Double quantity) {

    public static IngredientOutput from(final Ingredient ingredient) {
        Long ingredientId = null;
        if(ingredient.getId() != null){
            ingredientId = ingredient.getId().getValue();
        }

        return new IngredientOutput(ingredientId, ingredient.getName(), ingredient.getQuantity());
    }
}
