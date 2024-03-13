package com.snackhubmenu.infrastructure.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record IngredientResponse(
        @JsonProperty("id") Long id,
        @JsonProperty("name") String name,
        @JsonProperty("quantity") Double quantity) {
}
