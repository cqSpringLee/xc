package com.lc.demo01;

public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("xixi,son"+i);
        }
    }

    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
//        Thread thread = new Thread(testThread3);
//        thread.start();
        new Thread(testThread3).start();
        for (int i=0;i<20;i++){
            System.out.println("father");
        }

    }
}





































































































