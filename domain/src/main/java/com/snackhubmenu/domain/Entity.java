package com.snackhubmenu.domain;


import com.snackhubmenu.domain.validation.ValidationHandler;

public abstract class Entity<T extends Identifier> {

    protected final T id;

    protected Entity(final T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
