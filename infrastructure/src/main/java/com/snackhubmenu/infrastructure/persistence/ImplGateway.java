package com.snackhubmenu.infrastructure.persistence;

import com.snackhubmenu.domain.menu.ItemMenu;
import com.snackhubmenu.domain.menu.MenuGateway;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ImplGateway implements MenuGateway {

    private final MenuRepository repository;

    public ImplGateway(final MenuRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public List<ItemMenu> findAllItemMenu() {
        return this.repository.findAll().stream().map(ItemMenuJpaEntity::toAggregate).toList();
    }
}
