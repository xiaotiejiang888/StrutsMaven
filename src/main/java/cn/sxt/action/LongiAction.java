package cn.sxt.action;

import com.opensymphony.xwork2.ActionContext;

/**
 * Created by Administrator on 2016/2/28.
 */
public class LongiAction {
    private String name;
    private String pwd;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String execute() {
        if ("zmy".equals(name) && "123".equals(pwd)) {
            ActionContext.getContext().getSession().put("user",name);
            return "success";
        } else {
            return "login";
        }
    }
}
