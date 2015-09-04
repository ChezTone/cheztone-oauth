package org.cheztone.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // Example of use : http://localhost:8080/oauth/authorize?response_type=code&client_id=tone
        auth.inMemoryAuthentication().withUser("tone").password("tone").roles("CLIENT");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/**").access("hasRole('ROLE_CLIENT')")
                .and().formLogin().loginPage("/login");

    }
}
