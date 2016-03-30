package cn.sxt.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2016/3/30.
 */
    public class MyFilter1 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("do init MyFilter1");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=========================a:before doFilter1=========================");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("=========================b:after doFilter1=========================");
    }

    public void destroy() {
        System.out.println("do destroy");
    }
}
