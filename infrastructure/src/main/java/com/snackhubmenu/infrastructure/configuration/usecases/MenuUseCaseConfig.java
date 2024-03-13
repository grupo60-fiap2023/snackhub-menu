package com.snackhubmenu.infrastructure.configuration.usecases;

import com.snackhubmenu.application.menu.retrieve.FindMenuItemsUseCase;
import com.snackhubmenu.domain.menu.MenuGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuUseCaseConfig {

    private final MenuGateway gateway;

    public MenuUseCaseConfig(final MenuGateway gateway) {
        this.gateway = gateway;
    }

    @Bean
    public FindMenuItemsUseCase findAllOrders() {
        return new FindMenuItemsUseCase(gateway);
    }
}
