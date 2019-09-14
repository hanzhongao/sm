package com.imooc.sm.global;

import javax.servlet.*;
import java.io.IOException;

/**
 * Create by hza
 * 2019-09-09 16:01
 */
public class EncodingFiliter implements Filter {

    private String encoding = "UTF-8" ;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        if (filterConfig.getInitParameter("ENCODING") != null) {
            encoding = filterConfig.getInitParameter("ENCODING") ;
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encoding);
        servletResponse.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        encoding = null ;
    }
}
