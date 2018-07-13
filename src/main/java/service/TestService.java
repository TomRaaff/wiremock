package service;

import client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;

public class TestService {

    @Autowired
    private TestClient client;


    public void getSomething(){
        client.get();
    }
}
