package client;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@AllArgsConstructor

public class TestClient {

    private RestTemplate restTemplate;
    private URI uri;

    public void get(){
        ResponseEntity<JsonNode> responseEntity = restTemplate.exchange(new RequestEntity<>(null, HttpMethod.GET, uri), JsonNode.class);
    }

}
