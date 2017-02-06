package info.finny.msvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LabEurekaSentenceSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabEurekaSentenceSvcApplication.class, args);
	}
}
