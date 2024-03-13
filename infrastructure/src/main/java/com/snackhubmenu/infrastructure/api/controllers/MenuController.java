package com.snackhubmenu.infrastructure.api.controllers;

import com.snackhubmenu.application.menu.retrieve.FindMenuItemsUseCase;
import com.snackhubmenu.infrastructure.api.MenuAPI;
import com.snackhubmenu.infrastructure.model.ItemMenuResponse;
import com.snackhubmenu.infrastructure.presenters.MenuApiPresenter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class MenuController implements MenuAPI {

    private final FindMenuItemsUseCase findMenuItemsUseCase;

    public MenuController(final FindMenuItemsUseCase findMenuItemsUseCase) {
        this.findMenuItemsUseCase = findMenuItemsUseCase;
    }

    @Override
    public ResponseEntity<List<ItemMenuResponse>> listAllItemMenu() {
        return ResponseEntity.ok().body(this.findMenuItemsUseCase.execute().stream().map(MenuApiPresenter::present).toList());
    }
}
