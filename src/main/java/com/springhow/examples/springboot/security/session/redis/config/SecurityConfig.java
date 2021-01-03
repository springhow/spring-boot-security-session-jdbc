package com.springhow.examples.springboot.security.session.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2-console/**");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user").access("hasAuthority('canReadUser')")
                .antMatchers("/admin").access("hasAuthority('canReadAdmin')")
                .anyRequest().authenticated()
                .and().httpBasic()
                .and().formLogin();
    }
}
