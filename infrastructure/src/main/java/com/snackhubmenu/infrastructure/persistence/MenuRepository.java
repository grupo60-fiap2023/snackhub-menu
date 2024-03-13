package com.snackhubmenu.infrastructure.persistence;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<ItemMenuJpaEntity, Long> {

    @EntityGraph(type = EntityGraph.EntityGraphType.LOAD, attributePaths = "ingredients")
    List<ItemMenuJpaEntity> findAll();
}
