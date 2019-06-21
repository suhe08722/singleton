package hungry;

import com.gupao.singleton.hungry.HungrySingleton;

/**
 * 2019/6/20
 * suh
 **/
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.hungry();
    }
}
