package dev.mrkevr.errand_service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.mrkevr.errand_service.entity.Category;
import dev.mrkevr.errand_service.repository.CategoryRepository;

@SpringBootApplication
public class ErrandServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErrandServiceApplication.class, args);
	}
	
	/*
	 * Save initial categories
	 */
	@Bean
	CommandLineRunner runner(CategoryRepository categoryRepository) {
		return args -> {
			if (categoryRepository.findAll().isEmpty()) {
				List<String> categoryNames = this.getCategoryNames();
				Stream<Category> stream = categoryNames.stream().map(name -> new Category(name));
				categoryRepository.saveAll(stream::iterator);
			}
		};
	}
	
	private List<String> getCategoryNames(){
		return List.of(
				"Grocery Shopping",
				"Food Delivery", 
				"Package Delivery", 
				"Laundry Services",
				"Pet Services", 
				"Banking Tasks", 
				"Home Services", 
				"Administrative Tasks",
				"Booking and Reservation",
				"Miscellaneous");
	}
}
