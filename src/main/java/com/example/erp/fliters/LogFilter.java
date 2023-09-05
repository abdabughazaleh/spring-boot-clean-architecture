package com.example.erp.fliters;


import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

@Component
@Order(1)
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String correlationId = UUID.randomUUID().toString();
        MDC.put("IP-Address" , servletRequest.getRemoteAddr());
        MDC.put("USER-Host" , servletRequest.getRemoteHost());
        MDC.put("Request-Attrs" , servletRequest.getAttributeNames().toString());
        MDC.put("correlationId" , correlationId);
        filterChain.doFilter(servletRequest , servletResponse);
        MDC.clear();
    }
}
