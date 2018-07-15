package userbooks.web.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import userbooks.web.security.AuthFailHandler;
import userbooks.web.security.AuthSuccessHandler;
import userbooks.web.security.CustomAutenticationProvider;

/**
 * Created by yjlee on 2018-07-15.
 */

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Bean
    public AuthSuccessHandler authSuccessHandler(){
        return new AuthSuccessHandler();
    }

    @Bean
    public AuthFailHandler authFailHandler(){
        return new AuthFailHandler();
    }

    @Bean
    public CustomAutenticationProvider customAutenticationProvider(){
        return new CustomAutenticationProvider();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        configureAuthorizedRequest(http);
    }

    private void configureAuthorizedRequest(HttpSecurity http) throws Exception{

        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/","/css/**","/js/**", "/webjars/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/join").permitAll()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .loginProcessingUrl("/loginAct")
                .successHandler(authSuccessHandler())
                .failureHandler(authFailHandler())
                .usernameParameter("id")
                .passwordParameter("password")
                .permitAll()
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .deleteCookies("/")
                .permitAll()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER)
                .and();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.authenticationProvider(this.customAutenticationProvider());
    }

}
