package com.snackhubmenu.domain.menu;

public enum ItemMenuCategory {

    BEVERAGES("Bebidas"),
    DESSERT("Sobremesa"),
    SNACK("Lanche"),
    ACCOMPANIMENT("Acompanhamento");

    private final String name;

    ItemMenuCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
