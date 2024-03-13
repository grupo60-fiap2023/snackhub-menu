package com.snackhubmenu.application.menu.retrieve;


import com.snackhubmenu.domain.menu.ItemMenu;
import com.snackhubmenu.domain.menu.ItemMenuCategory;
import java.math.BigDecimal;
import java.util.List;

public record ItemMenuOutput(Long id,
                             String name,
                             BigDecimal price,
                             ItemMenuCategory category,
                             List<IngredientOutput> ingredients) {

    public static ItemMenuOutput from(final ItemMenu item) {
        List<IngredientOutput> ingredients = item.getIngredients().stream().map(IngredientOutput::from).toList();

        Long itemId = null;
        if(item.getId() != null){
            itemId = item.getId().getValue();
        }
        return new ItemMenuOutput(itemId, item.getName(), item.getPrice(), item.getCategory(), ingredients);
    }
}
