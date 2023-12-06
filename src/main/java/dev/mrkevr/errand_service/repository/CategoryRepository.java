package dev.mrkevr.errand_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mrkevr.errand_service.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

	Optional<Category> findByNameIgnoreCase(String name);
	
	boolean existsByNameIgnoreCase(String name);
}