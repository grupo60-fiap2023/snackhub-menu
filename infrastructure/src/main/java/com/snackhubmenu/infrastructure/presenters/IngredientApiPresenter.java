package com.snackhubmenu.infrastructure.presenters;

import com.snackhubmenu.application.menu.retrieve.IngredientOutput;
import com.snackhubmenu.infrastructure.model.IngredientResponse;

public interface IngredientApiPresenter {

    static IngredientResponse present(final IngredientOutput ingredient) {
        return new IngredientResponse(ingredient.id(),
                ingredient.name(),
                ingredient.quantity());
    }
}
