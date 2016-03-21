package cn.sxt.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**方法拦截器
 * Created by Administrator on 2016/3/20.
 */
public class ListInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("方法拦截器被执行");
        return actionInvocation.invoke();
    }
}
