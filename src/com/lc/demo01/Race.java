package com.lc.demo01;

public class Race implements Runnable{
    private static String winer;
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (Thread.currentThread().getName().equals("兔子")){
//                if (Thread.currentThread().getName().equals("兔子")&& i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = gameOver(i);
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"run"+i+"step");
        }
    }
    private boolean gameOver(int steps){
        if (winer!=null){ //已经存在胜利者
            return true;
        }{
            if (steps==100){
                winer = Thread.currentThread().getName();
                System.out.println("winner is"+winer);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"乌龟").start();
        new Thread(race,"兔子").start();
    }
}





































































































