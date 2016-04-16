package cn.sxt.base;

/**
 * Created by Administrator on 2016/4/9.
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal t1 = new ThreadLocal();
        t1.set("hello world");       //key是当前线程
        Thread1 tt = new Thread1(t1);
        tt.start();
        t1.set("hello world0000000000");
        Object o = t1.get();
        dayin(o);


    }

    private static void dayin(Object o) {
        System.out.println(Thread.currentThread().getName() + ":" + o);
    }
}
