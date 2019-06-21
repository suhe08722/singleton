package lazy;

/**
 * 2019/6/20
 * suh
 **/
public class LazySimpleSinglestonTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());

        t1.start();
        t2.start();

        System.out.println("Thread is end");
    }
}
