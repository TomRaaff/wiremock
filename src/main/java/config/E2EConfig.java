package config;

import client.TestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Configuration
@Profile("e2e")
public class E2EConfig {

    @Value("${e2e.endpoint}")
    private URI e2eUri;

    private RestTemplate restTemplate;

    @Bean("client")
    public TestClient e2eClient() {return new TestClient(restTemplate, e2eUri);}

}