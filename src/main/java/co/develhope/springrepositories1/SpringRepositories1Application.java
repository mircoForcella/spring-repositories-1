package co.develhope.springrepositories1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = { EnableHypermediaSupport.HypermediaType.HAL })
public class SpringRepositories1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRepositories1Application.class, args);
    }

}
