package com.ky.filters;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("MyFilter is starting");
    }

    public void destroy() {
        System.out.println("MyFilter is ending");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);
    }
}
