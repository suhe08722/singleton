package lazy;

import com.gupao.singleton.lazy.LazyDoubleLockSingleton;
import com.sun.scenario.effect.impl.prism.ps.PPStoPSWDisplacementMapPeer;

/**
 * 2019/6/20
 * suh
 **/
public class LazyDoubleLocakTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());

        t1.start();
        t2.start();
    }
}
