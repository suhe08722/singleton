package com.gupao.singleton.lazy;

/**
 * 2019/6/20
 * suh
 **/
public class LazyDoubleLockSingleton {
    private LazyDoubleLockSingleton(){}

    private static LazyDoubleLockSingleton lazyDoubleLockSingleton = null;

    public static LazyDoubleLockSingleton getInstance() {
        if(lazyDoubleLockSingleton == null){
            synchronized (LazyDoubleLockSingleton.class){
                if(lazyDoubleLockSingleton == null){
                    lazyDoubleLockSingleton = new LazyDoubleLockSingleton();
                }
            }
        }
        return lazyDoubleLockSingleton;
    }
}
