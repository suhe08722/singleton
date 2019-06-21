package lazy;

import com.gupao.singleton.lazy.InnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 2019/6/20
 * suh
 **/
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
//        使用反射的方式获取对象
        try {
        Class<?> clazz = InnerClassSingleton.class;

        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object obj1 = c.newInstance();

        Object obj2 = InnerClassSingleton.getInstance();
        Object obj3 = InnerClassSingleton.getInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
