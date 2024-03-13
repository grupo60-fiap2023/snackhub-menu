package com.snackhubmenu.infrastructure.presenters;

import com.snackhubmenu.application.menu.retrieve.ItemMenuOutput;
import com.snackhubmenu.infrastructure.model.ItemMenuResponse;

public interface MenuApiPresenter {
    static ItemMenuResponse present(ItemMenuOutput item) {
        var ingredients = item.ingredients().stream().map(IngredientApiPresenter::present).toList();
        return new ItemMenuResponse(item.id(), item.name(), item.price(), item.category().getName(), ingredients);
    }
}
