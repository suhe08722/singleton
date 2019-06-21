package com.gupao.singleton.registersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/6/20
 * suh
 * 注册时单例模式，适合建立非常多的单例模式，但是是非线程安全的
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }
}
