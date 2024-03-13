package com.snackhubmenu.infrastructure.api;

import com.snackhubmenu.infrastructure.model.ItemMenuResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "menu")
@Tag(name = "Menu")
public interface MenuAPI {
    @GetMapping("/list")
    @Operation(summary = "List all items of menu")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listed successfully"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown"),
    })
    ResponseEntity<List<ItemMenuResponse>> listAllItemMenu();
}
