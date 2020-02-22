package com.example.anotherspringboot;

import com.example.anotherspringboot.domain.Car;
import com.example.anotherspringboot.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository carRepository){
		return (args) -> {
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
			carRepository.save(new Car("Suzuki", "Sedan", "red", "Solar", 23));
		};
	}

}
