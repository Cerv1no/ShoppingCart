package com.tortas.microservice.repository;

import com.tortas.microservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
