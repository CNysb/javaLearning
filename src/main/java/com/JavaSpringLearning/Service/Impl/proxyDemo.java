package com.JavaSpringLearning.Service.Impl;

public class proxyDemo {
    public static void main(String[] args) {
        Star jay = new Star("jay");
        SuperStar proxy = StarProxy.createProxy(jay);
        System.out.println(proxy.sing("song1"));
        proxy.dance("dance1");


    }
}


