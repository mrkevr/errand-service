package dev.mrkevr.errand_service.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrandResponse {

	UUID id;

	UUID userId;

	String title;

	String description;

	String location;

	String phone;

	double compensation;

	LocalDate dateDue;

	LocalTime timeDue;

	String category;

	String imageUrl;
}
