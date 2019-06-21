package com.gupao.singleton.lazy;

/**
 * 2019/6/20
 * suh
 **/
public class LazyLockSingleton {
    private LazyLockSingleton(){};

    private static LazyLockSingleton lazyLockSingleton = null;

    public static synchronized LazyLockSingleton getInstance(){
        if(lazyLockSingleton == null){
            lazyLockSingleton = new LazyLockSingleton();
        }
        return lazyLockSingleton;
    }

}
