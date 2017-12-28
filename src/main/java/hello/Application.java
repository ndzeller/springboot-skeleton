package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

//https://spring.io/guides/gs/serving-web-content/
    //public static void main(String[] args) {
    //    SpringApplication.run(Application.class, args);
    //}

    private static final Logger log = LoggerFactory.getLogger(Application.class);

// https://spring.io/guides/gs/consuming-rest/
    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }


}