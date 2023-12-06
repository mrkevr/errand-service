package dev.mrkevr.errand_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mrkevr.errand_service.entity.Errand;
import dev.mrkevr.errand_service.entity.ImageFile;

public interface ImageFileRepository extends JpaRepository<ImageFile, UUID> {

	Optional<ImageFile> findByErrand(Errand errand);
}
