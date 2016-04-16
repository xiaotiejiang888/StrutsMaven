package cn.sxt.base;

/**
 * Created by Administrator on 2016/4/9.
 */
public class Thread1 extends  Thread{
    private ThreadLocal t1;

    public Thread1(ThreadLocal t1) {
        this.t1 = t1;
    }

    public Thread1() {
    }

    @Override
    public void run() {
//        t1.set("666666");
        String x = (t1==null?(Thread.currentThread().getName()+":hello world"):Thread.currentThread().getName() + ":" + t1.get());
        System.out.println(x);
    }
}
