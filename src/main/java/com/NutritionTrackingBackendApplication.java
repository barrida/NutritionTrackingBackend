package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.model.Food;
import com.repository.IFoodRepository;

@SpringBootApplication
public class NutritionTrackingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutritionTrackingBackendApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initializeFoodRepository(IFoodRepository foodRepository) {
		return (args) -> {
			
			//initialize foods
			foodRepository.deleteAll();
			foodRepository.save(new Food(1l, "Oats", 4, 0.66, 0.17, 0.07, 1, "g"));
			foodRepository.save(new Food(2l, "Bananas", 1, 0.23, 0.01, 0, 1, "g"));
			foodRepository.save(new Food(3l, "Bananas", 90, 23.7, 1.1, 0.33, 1, "small"));
			foodRepository.save(new Food(4l, "Bananas", 105, 26.95, 1.29, 0.39, 1, "medium"));
			foodRepository.save(new Food(5l, "Egg", 54, 0.28, 4.65, 3.68, 1, "small"));
			foodRepository.save(new Food(6l, "Egg", 65, 0.34, 5.54, 4.37, 1, "medium"));
			foodRepository.save(new Food(7l, "Egg", 74, 0.38, 6.29, 4.97, 1, "large"));
			foodRepository.save(new Food(8l, "Chicken Breast", 2, 0, 0.3, 0.08, 1, "g"));
			foodRepository.save(new Food(9l,  "Bulgur Cooked", 151, 33.82, 5.61, 0.44, 1, "cup"));
			foodRepository.save(new Food(10l, "Bulgur Cooked", 1, 0.19, 0.03, 0, 1, "g"));

		};
	}
}
