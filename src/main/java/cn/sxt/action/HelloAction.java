package cn.sxt.action;

import com.opensymphony.xwork2.Action;


/**
 * Created by Administrator on 2016/3/18.
 */
public class HelloAction {
    //Git is a free software
    private String name;
    public  String execute(){
        System.out.println("name ="+name);
        return Action.SUCCESS;
    }
    public String list(){
        System.out.println("list");
        return Action.SUCCESS;
    }
    public String add(){
        System.out.println("add");
        return Action.SUCCESS;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
