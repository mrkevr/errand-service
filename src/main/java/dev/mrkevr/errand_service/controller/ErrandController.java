package dev.mrkevr.errand_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.mrkevr.errand_service.dto.NewErrandDTO;
import dev.mrkevr.errand_service.validator.ValidImageFile;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Validated
@RestController
@RequestMapping("/api/errands")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ErrandController {
	
	@PostMapping
	ResponseEntity<?> saveUser(
			@Valid @RequestPart NewErrandDTO errand,
			@Valid @ValidImageFile @RequestParam(name = "imageFile", required = true) MultipartFile imageFile) {
		
		
		
		
		return null;
	}
	
}
