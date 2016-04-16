package cn.sxt.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/4/10.
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 3, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        soutTime();
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutTime();
                System.out.println(Thread.currentThread().getName()+":1hello world");
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutTime();
                System.out.println(Thread.currentThread().getName()+":2hello world");
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutTime();
                System.out.println(Thread.currentThread().getName()+":3hello world");
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutTime();
                System.out.println(Thread.currentThread().getName()+":4hello world");
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutTime();
                System.out.println(Thread.currentThread().getName()+":5hello world");
            }
        });
//        Thread1 thread1 = new Thread1();
//        Thread1 thread11 = new Thread1();
//        Thread1 thread12 = new Thread1();
//        Thread1 thread13 = new Thread1();
//        Thread1 thread14 = new Thread1();
//        Thread1 thread15 = new Thread1();
//        thread1.start();
//        thread11.start();
//        thread12.start();
//        thread13.start();
//        thread14.start();
//        thread15.start();
    }
    private static void soutTime(){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String dateStr=sdf.format(new Date());
        System.out.println(dateStr);
    }
}
