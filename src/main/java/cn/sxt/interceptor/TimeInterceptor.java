package cn.sxt.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**计算action的执行时间  分享可以讲struts2的拦截器和涉及到的设计模式
 * 适配器模式 在swing中应用的多
 * 责任链模式
 * interceptor是单例的
 *拦截器的实现过程是aop,代理  动态代理设计模式
 * Created by Administrator on 2016/3/18.
 */
public class TimeInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        long start = System.currentTimeMillis();
        //执行下一个拦截器 当拦截器执行完 执行action
        String result = actionInvocation.invoke();
        long end = System.currentTimeMillis();
        System.out.println("执行该action所用时间为:"+(end - start)+"ms");
        return result;
    }
}
