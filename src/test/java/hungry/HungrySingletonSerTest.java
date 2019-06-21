package hungry;

import com.gupao.singleton.hungry.HungrySingleton;
import com.gupao.singleton.hungry.HungrySingletonSer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 2019/6/20
 * suh
 **/
public class HungrySingletonSerTest {
    public static void main(String[] args) {
        HungrySingletonSer s1 = null;
        HungrySingletonSer s2 = HungrySingletonSer.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Serializable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);

            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("Serializable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (HungrySingletonSer)ois.readObject();
            ois.close();
            fis.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
