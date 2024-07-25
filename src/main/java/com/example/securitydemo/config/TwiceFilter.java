package com.example.securitydemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 注意：所有Filter实现类注册到Spring 容器中都会默认被注册到Web 容器中，
 * OncePerRequestFilter是例外，但仍然不建议如此使用
 * 若实现的是GenericFilterBean，则这个Filter会被调用两次，
 * 一次是Spring Security(Spring Security的Filter在前)，
 * 一次是Spring 容器
 * 注册OncePerRequestFilter 此Filter不会被
 *
 * @author liujiaming
 * @since 2024-07-25
 */
@Slf4j
//@Component
public class TwiceFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        log.info("twice, chain: {}, url：{}，before...", filterChain, request.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("twice, chain: {}, url：{}，after...", filterChain, request.getRequestURI());
    }
}
