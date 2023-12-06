package dev.mrkevr.errand_service.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewErrandDTO {

	@NotNull(message = "Field `userId` must not be empty")
	UUID userId;

	@NotNull(message = "Field `categoryId` must not be empty")
	UUID categoryId;

	@NotEmpty(message = "Field `title` must not be empty")
	String title;

	@NotEmpty(message = "Field `description` must not be empty")
	String description;

	@NotEmpty(message = "Field `location` must not be empty")
	String location;

	@NotEmpty(message = "Field `phone` must not be empty")
	String phone;

	@Positive(message = "Must enter positove compensation")
	double compensation;

	@Future(message = "Must enter a date in the future")
	LocalDate dateDue;

	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	LocalTime timeDue;
}
