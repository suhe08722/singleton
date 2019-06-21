package lazy;

import com.gupao.singleton.lazy.LazySimpleSingletan;

/**
 * 2019/6/20
 * suh
 **/
public class ExcutorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingletan lazySimpleSingletan = LazySimpleSingletan.getInstance();
        System.out.println(Thread.currentThread().getName() +" "+lazySimpleSingletan);
//        lazySimpleSingletan.lazy();
    }
}
