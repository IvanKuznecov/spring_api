package dev.dataivan.mqttdata;

import dev.dataivan.mqttdata.run.Location;
import dev.dataivan.mqttdata.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class MqttDataApplication {

	private static final Logger log = LoggerFactory.getLogger(MqttDataApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MqttDataApplication.class, args);

		log.info("App started successfully!");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			LocalDateTime now = LocalDateTime.now();

			// Subtract 2 hours
			LocalDateTime twoHoursEarlier = now.minusHours(2);
			Run run = new Run(1,"my run", twoHoursEarlier, now, 5, Location.INDOOR);

			log.info("Run: " + run);
		};
	}

}
