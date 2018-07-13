//package config;
//
//
//import client.TestClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
//import java.net.URI;
//
//@Configuration
//public class ClientConfig {
//
//
//    @Value("${e2e.endpoint}")
//    private URI e2eUri;
//
//    @Value("${wiremock.endpoint}")
//    private URI wiremockUri;
//
//    private RestTemplate restTemplate;
//
//
//    @Bean
//    public TestClient testClient(){}
//}
