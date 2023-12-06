package dev.mrkevr.errand_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.mrkevr.errand_service.entity.Category;
import dev.mrkevr.errand_service.exception.CategoryNotFoundException;
import dev.mrkevr.errand_service.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	public Category getById(UUID id) {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new CategoryNotFoundException("Could not find category with that id"));
	}

	public Category getByName(String name) {
		return categoryRepository.findByNameIgnoreCase(name)
				.orElseThrow(() -> new CategoryNotFoundException("Could not find category with that name"));
	}
}
