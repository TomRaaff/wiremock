package service;

import client.TestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ActiveProfiles("e2e")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestServiceTest {

    @Autowired
    @Qualifier("client")
    private TestClient client;

    @Test
    public void doSomething(){
        client.get();
    }


}