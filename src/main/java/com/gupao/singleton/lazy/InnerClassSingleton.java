package com.gupao.singleton.lazy;

import java.security.PrivateKey;

/**
 * 2019/6/20
 * suh
 * 静态内部类方法，兼顾兼顾饿汉式资源浪费和线程安全问题
 * 内部静态类，默认不加载，只有在调用的时候才加载
 **/
public class InnerClassSingleton {
    private InnerClassSingleton(){
        //防止反射，最好的单例模式实现方式
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    };

    public static final InnerClassSingleton getInstance(){
//        返回结果前一定会先加载内部静态类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder{
        private static final InnerClassSingleton LAZY = new InnerClassSingleton();
    }
}
