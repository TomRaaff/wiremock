package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {


    @Value("${test.endpoint}")
    private String endpoint;


    public String getSomething(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(endpoint, String.class);


    }
}
