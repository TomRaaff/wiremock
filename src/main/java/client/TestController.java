package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import service.TestService;


@RestController
@RequestMapping("/test")
public class TestController {

    private final RestTemplate restTemplate;
    private final TestService testService;

    @Autowired
    public TestController(RestTemplate restTemplate, TestService testService) {
        this.restTemplate = restTemplate;
        this.testService = testService;
    }

    //return random number to simulate e2e risks
    @GetMapping("/e2e")
    public String getE2E() {

        int random = (int) (Math.random() * 100);
        if (random %2 == 0){
            return "50";
        } else {
            return "" + random;
        }
    }
    //need to replace this with actual wiremock service
    @GetMapping("/wiremock")
    public String getWiremock(){
        return "50";
    }

}
