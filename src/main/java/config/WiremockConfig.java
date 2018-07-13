package config;

import client.TestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
@Configuration
@Profile("wiremock")
public class WiremockConfig {

    @Value("${wiremock.endpoint}")
    private URI wiremockUri;

    private RestTemplate restTemplate;

    @Bean("client")
    public TestClient wiremockClient() {return new TestClient(restTemplate, wiremockUri);}

}
