package com.gupao.singleton.hungry;

/**
 * 2019/6/20
 * suh
 * 饿汉式单例模式
 * 有点：类加载时就创建了对象，不存在线程安全问题
 * 缺点：不管调用没调用都占用内存
 * 适用于单例模式类不多的情况
 **/
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public void hungry(){
        System.out.println("This is a hungry singleton");
    }

}
