package com.example.todogether;

import com.example.todogether.SubsistemaComunicacaoAPILogin.SubsistemaComunicacaoAPILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private SubsistemaComunicacaoAPILogin subsistemaComunicacaoAPILogin;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                    .userInfoEndpoint()
                    .userService(subsistemaComunicacaoAPILogin);

        return http.build();
    }
}
