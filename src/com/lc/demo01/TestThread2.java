package com.lc.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class TestThread2 extends Thread{
    private String url;
    private String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        try {
            webDownLoader.downloader(url,name);
            System.out.println("download file "+name);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://www.huiyi8.com/sc/1046711.html","xixi 1");
        TestThread2 t2 = new TestThread2("https://www.huiyi8.com/sc/999527.html","haha 2");
        TestThread2 t3 = new TestThread2("https://www.huiyi8.com/sc/985856.html","hehe 3");
        t1.start();
        t2.start();
        t3.start();

    }
}

//download
class WebDownLoader{
    public void downloader(String url,String name) throws MalformedURLException {
        //下载方法
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("wrong");
        } finally {

        }
    }
}
