package com.snackhubmenu.application.menu.retrieve;

import com.snackhubmenu.application.NullaryUseCase;
import com.snackhubmenu.domain.menu.MenuGateway;

import java.util.*;

public class FindMenuItemsUseCase extends NullaryUseCase<List<ItemMenuOutput>> {

    private final MenuGateway gateway;

    public FindMenuItemsUseCase(final MenuGateway gateway) {
        this.gateway = Objects.requireNonNull(gateway);
    }

    @Override
    public List<ItemMenuOutput> execute() {
        return this.gateway.findAllItemMenu().stream().map(ItemMenuOutput::from).toList();
    }
}
