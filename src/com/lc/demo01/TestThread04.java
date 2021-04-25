package com.lc.demo01;

public class TestThread04 implements Runnable{
    private int ticketNums= 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            ticketNums--;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第 "+ticketNums+"票.");
        }
    }

    public static void main(String[] args) {
        TestThread04 ticket = new TestThread04();
        new Thread(ticket,"小米").start();
        new Thread(ticket,"teacher").start();
        new Thread(ticket,"student").start();
    }
}
