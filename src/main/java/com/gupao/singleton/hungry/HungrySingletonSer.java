package com.gupao.singleton.hungry;

import java.io.Serializable;

/**
 * 2019/6/20
 * suh
 **/
public class HungrySingletonSer implements Serializable {
    private static final HungrySingletonSer hungrySingletonSer = new HungrySingletonSer();

    private HungrySingletonSer(){}

    public static HungrySingletonSer getInstance(){
        return hungrySingletonSer;
    }

    //增减代码防止序列化和反序列话后的单例模式建立多个兑现
    private Object readResolve(){
        return hungrySingletonSer;
    }
}
