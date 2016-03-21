package cn.sxt.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/2/28.
 */
public class ServletTest extends HttpServlet{
    public ServletTest() {
        System.out.println("constructor");
    }

    //客户端用get方式访问的时候   浏览器访问
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
//        resp.getWriter().write("<a href= 'http://www.bjsxt.com'>go</a>");
    }
    //post 表单提交 并method被设置为post

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}
