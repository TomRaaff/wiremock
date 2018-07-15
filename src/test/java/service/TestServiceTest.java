package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

//different result based on activeprofile
@ActiveProfiles("e2e")
@RunWith(SpringRunner.class)
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void doSomething(){
        assertThat(testService.getSomething()).isEqualTo("50");
    }


}