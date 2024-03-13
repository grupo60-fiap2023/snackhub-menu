package com.snackhubmenu.infrastructure.persistence;

import com.snackhubmenu.domain.menu.ItemMenu;
import com.snackhubmenu.domain.menu.ItemMenuCategory;
import com.snackhubmenu.domain.menu.ItemMenuId;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "ItemMenu")
@Table(name = "items_menu")
public class ItemMenuJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "category", nullable = false)
    @Convert(converter = CategoryConverter.class)
    private ItemMenuCategory category;

    @OneToMany(mappedBy = "itemMenuJpaEntity", fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
    private List<IngredientJpaEntity> ingredients;

    public ItemMenuJpaEntity() {
    }

    public ItemMenu toAggregate() {
        var ingredients = getIngredients().stream().map(IngredientJpaEntity::toAggregate).toList();
        return new ItemMenu(
                ItemMenuId.from(getId()),
                getName(),
                getPrice(),
                getCategory(),
                ingredients);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemMenuCategory getCategory() {
        return category;
    }

    public List<IngredientJpaEntity> getIngredients() {
        return ingredients;
    }
}
