package com.lc.demo01;
//创建线程方式一：继承Thread，重新run()方法，调用start
public class TestThread1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("xixi,son"+i);
        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
//        testThread1.run();
        testThread1.start();
        for (int i=0;i<20;i++){
            System.out.println("father");
        }

    }
}
