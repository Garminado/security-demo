package com.example.securitydemo.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author liujiaming
 * @since 2024-07-25
 */
@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
//    private final OnceFilter onceFilter;
//    private final TwiceFilter twiceFilter;
//    private final AuthenticationEntryPointImpl authenticationEntryPoint;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/*.html").permitAll()
                .anyRequest().authenticated();
        http.formLogin();
        http.httpBasic();
//        http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint);
//        http.addFilterBefore(onceFilter, UsernamePasswordAuthenticationFilter.class);
//        http.addFilterBefore(twiceFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
