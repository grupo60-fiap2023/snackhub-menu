package com.snackhubmenu.infrastructure.persistence;


import com.snackhubmenu.domain.menu.Ingredient;
import com.snackhubmenu.domain.menu.IngredientId;
import com.snackhubmenu.domain.menu.ItemMenu;
import com.snackhubmenu.domain.menu.ItemMenuId;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "Ingredient")
@Table(name = "ingredients")
public class IngredientJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @ManyToOne
    @JoinColumn(name = "item_menu_id")
    private ItemMenuJpaEntity itemMenuJpaEntity;

    public IngredientJpaEntity() {
    }

    public Ingredient toAggregate() {
        return new Ingredient(
                IngredientId.from(getId()),
                getName(),
                getQuantity());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public ItemMenuJpaEntity getItemMenuJpaEntity() {
        return itemMenuJpaEntity;
    }
}
