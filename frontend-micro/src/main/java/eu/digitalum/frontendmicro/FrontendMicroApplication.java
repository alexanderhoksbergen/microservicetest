package eu.digitalum.frontendmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FrontendMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendMicroApplication.class, args);
	}

}
