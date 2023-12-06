package dev.mrkevr.errand_service.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.mrkevr.errand_service.entity.Category;
import dev.mrkevr.errand_service.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

	private final CategoryService categoryService;

	@GetMapping
	ResponseEntity<?> getAll(@RequestParam(required = false) String name) {
		Object body;
		
		if (name == null) {
			body = categoryService.getAll();
		} else {
			body = categoryService.getByName(name);
			
		}
		return ResponseEntity.ok(body);
	}

	@GetMapping("/{id}")
	ResponseEntity<?> getById(@PathVariable UUID id) {
		Category category = categoryService.getById(id);
		return ResponseEntity.ok(category);
	}
}
