package userbooks.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * Created by yjlee on 2018-07-08.
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages="userbooks.dao")
@EntityScan(basePackages = "userbooks.model")
@ComponentScan(basePackages = "userbooks.*")
@EnableAutoConfiguration
@Configuration
//@EnableGlobalMethodSecurity
public class WebApplication {

    public static void main(String[] args){
        SpringApplication.run(WebApplication.class,args);
    }

}
