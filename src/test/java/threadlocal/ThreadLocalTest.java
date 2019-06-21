package threadlocal;

import com.gupao.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 2019/6/20
 * suh
 **/
public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());
        t1.start();
        t2.start();

        System.out.println("end");
    }
}
