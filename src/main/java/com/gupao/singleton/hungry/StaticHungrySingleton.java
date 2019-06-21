package com.gupao.singleton.hungry;

/**
 * 2019/6/20
 * suh
 * 静态饿汉式模式
 **/
public class StaticHungrySingleton {
    private static final StaticHungrySingleton staticHungrySingleton;

    static{
        staticHungrySingleton = new StaticHungrySingleton();
    }

    private StaticHungrySingleton(){};

    public static StaticHungrySingleton getInstance() {
        return staticHungrySingleton;
    }

    public void staticHungry(){
        System.out.println("This is a staticHungrySingleton");
    }
}
