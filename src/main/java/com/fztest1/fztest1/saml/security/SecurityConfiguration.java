package com.fztest1.fztest1.saml.security;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
@Order(2)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers(GET, "/home").permitAll()
                .antMatchers(GET, "/api/samlLink").permitAll()
                .antMatchers(GET, "/saml/sso").permitAll()
                .antMatchers(POST, "/saml/sso").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/home")
        ;

        http.csrf().disable();
        http.headers().cacheControl().disable();
    }
}