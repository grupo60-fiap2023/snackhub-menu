package com.snackhubmenu.domain.menu;

import com.snackhubmenu.domain.Identifier;

public class ItemMenuId extends Identifier {

    private final Long value;

    public ItemMenuId(Long value) {
        this.value = value;
    }

    public static ItemMenuId from(final Long id) {
        return new ItemMenuId(id);
    }

    @Override
    public Long getValue() {
        return value;
    }
}
