package com.gupao.singleton.lazy;

/**
 * 2019/6/20
 * suh
 **/
public class LazySimpleSingletan {
    private LazySimpleSingletan(){};

    private static LazySimpleSingletan lazySimpleSingletan = null;

    public static LazySimpleSingletan getInstance() {
        if(lazySimpleSingletan == null){
            lazySimpleSingletan = new LazySimpleSingletan();
        }
        return lazySimpleSingletan;
    }

    public void lazy(){
        System.out.println("This is a lazySimpleSingleton");
    }
}
