package dev.mrkevr.errand_service.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mrkevr.errand_service.entity.Category;
import dev.mrkevr.errand_service.entity.Errand;

public interface ErrandRepository extends JpaRepository<Errand, UUID> {

	List<Errand> findByUserId(UUID userId);

	List<Errand> findByCategory(Category category);
}
