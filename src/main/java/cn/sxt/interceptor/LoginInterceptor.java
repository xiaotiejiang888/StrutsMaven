package cn.sxt.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/**
 * Created by Administrator on 2016/3/20.
 */
public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //判断是否是login.action
        String actionName = actionInvocation.getProxy().getActionName();
        System.out.println("actionName ="+actionName );
        if("login".equals(actionName)){
           return actionInvocation.invoke();
        }
        Object user = actionInvocation.getInvocationContext().getSession().get("user");
        if(user == null){
                     return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
