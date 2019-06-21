package threadlocal;

import com.gupao.singleton.lazy.LazySimpleSingletan;
import com.gupao.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 2019/6/20
 * suh
 **/
public class ExcutorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +" "+singleton);
//        lazySimpleSingletan.lazy();
    }
}
