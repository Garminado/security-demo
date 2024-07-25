package com.example.securitydemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liujiaming
 * @since 2024-07-25
 */
@Slf4j
//@Component
public class OnceFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        log.info("chain: {}, url：{}，before...", filterChain, request.getRequestURI());
        filterChain.doFilter(request, response);
        log.info("chain: {}, url：{}，after...", filterChain, request.getRequestURI());
    }
}
