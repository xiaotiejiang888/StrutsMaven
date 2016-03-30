package cn.sxt.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2016/3/30.
 */
public class MyFilter2 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("do init MyFilter2");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=========================c:before doFilter222222222222222=========================");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("=========================d:after doFilter222222222222222=========================");
    }

    public void destroy() {

    }
}
