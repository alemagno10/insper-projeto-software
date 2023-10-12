package com.insper.partida.common;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.insper.partida.common.Partida.PartidaService;

import java.io.IOException;

@Component
@Order(1)
public class LoginFilter implements Filter {

    @Autowired
    PartidaService partidaService;

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        
        String token = req.getHeader("token");
        String uri = req.getRequestURI();
        String method = req.getMethod();

        partidaService.checkUser(token);
        chain.doFilter(request, response);
    }
}
