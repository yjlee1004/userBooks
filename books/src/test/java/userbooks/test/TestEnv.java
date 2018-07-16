package userbooks.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yjlee on 2018-07-15.
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages="userbooks.dao")
@EntityScan(basePackages = "userbooks.model")
@ComponentScan(basePackages = "userbooks.*")
//@EnableAutoConfiguration
@Transactional
//@SpringApplicationConfiguration(classes = TestEnv.class)
@Configuration
public class TestEnv {

    public static void main(String[] args)
    {
        SpringApplication.run(TestEnv.class, args);
    }
}
