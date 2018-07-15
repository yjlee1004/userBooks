package userbooks.web.configuration;


import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.sql.SQLException;

/**
 * Created by yjlee on 2018-07-08.
 */

@Configuration
public class H2Configuration {



//    @Bean
//    public SpringTemplateEngine templateEngine(){
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.addDialect(new LayoutDialect());
//        return templateEngine;
//    }


//    @Bean
//    public Server h2TcpServer() throws SQLException {
//        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
//    }


}
