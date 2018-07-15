package userbooks.web.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import userbooks.dto.UserDto;
import userbooks.dto.UserSession;
import userbooks.service.user.UserService;
import userbooks.util.HttpUtil;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yjlee on 2018-07-15.
 */
@Component
@Slf4j
public class CustomAutenticationProvider implements AuthenticationProvider{

    @Autowired
    UserService userService;

    @Autowired
    HttpSession httpSession;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String id = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        log.info(" authenticate user info , id = " + id + " , password = " + password);

        Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("ROLE_USER"));
        roles.add(new SimpleGrantedAuthority("ROLE_ANONYMOUS"));

        //
        UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(id, password, roles);
        result.setDetails(new CurrentUser(id,password, roles));

        //
        UserDto userDto = userService.getById(id);
        httpSession.setAttribute(HttpUtil.USER_SESSION_NAME,new UserSession(userDto.getNo(),userDto.getId(),userDto.getName()));

        return result;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
