package com.snackhubmenu.infrastructure.persistence;

import com.snackhubmenu.domain.menu.ItemMenuCategory;
import jakarta.persistence.AttributeConverter;

import java.util.stream.Stream;

public class CategoryConverter implements AttributeConverter<ItemMenuCategory, String> {
    @Override
    public String convertToDatabaseColumn(ItemMenuCategory category) {
        return category.getName();
    }

    @Override
    public ItemMenuCategory convertToEntityAttribute(String value) {
        return Stream.of(ItemMenuCategory.values()).filter(category -> category.getName().equalsIgnoreCase(value)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
