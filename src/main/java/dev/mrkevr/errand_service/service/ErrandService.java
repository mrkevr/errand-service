package dev.mrkevr.errand_service.service;

import org.springframework.stereotype.Service;

import dev.mrkevr.errand_service.repository.ErrandRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ErrandService {

	private final ErrandRepository errandRepository;
}
