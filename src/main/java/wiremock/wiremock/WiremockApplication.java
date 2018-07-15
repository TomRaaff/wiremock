package wiremock.wiremock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Import(ClientConfig.class)
@ComponentScan(basePackageClasses = WiremockApplication.class)
public class WiremockApplication {

	public static void main(String[] args) {
		SpringApplication.run(WiremockApplication.class, args);
	}
}
