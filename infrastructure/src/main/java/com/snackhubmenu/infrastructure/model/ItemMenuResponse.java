package com.snackhubmenu.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public record ItemMenuResponse(
        @JsonProperty("id") Long id,
        @JsonProperty("name") String name,
        @JsonProperty("price") BigDecimal price,
        @JsonProperty("category") String category,
        @JsonProperty("ingredients") List<IngredientResponse> ingredients) {
}
