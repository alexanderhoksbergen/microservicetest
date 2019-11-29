package eu.digitalum.stockservice;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import eu.digitalum.stockservice.dao.StockLevelRepository;
import eu.digitalum.stockservice.entity.StockLevel;

@SpringBootApplication
@EnableDiscoveryClient
public class StockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}
	@Bean
    ApplicationRunner init(StockLevelRepository repository) {
        return args -> {
            Stream.of("WDB030WCS", "WCE330WPS", "WCI670XL", "WM16W790NL", "WDD330WCS",
                    "WL8FENS96", "WW80K6404QW", "L6FBN84GP").forEach(name -> {
                repository.save(new StockLevel(name, 10L, "my_garage", LocalDateTime.now()));
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}
