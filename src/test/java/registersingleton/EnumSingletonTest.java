package registersingleton;

import com.gupao.singleton.registersingleton.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

/**
 * 2019/6/20
 * suh
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton es1 = null;
        EnumSingleton es2 = EnumSingleton.getInstance();

        try{
            FileOutputStream fos = new FileOutputStream("enum.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(es2);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("enum.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            es1 = (EnumSingleton)ois.readObject();
            ois.close();
            fis.close();

            es1.setData("es1");
            es2.setData("es2");

            System.out.println(es1.getData());
            System.out.println(es2.getData());
            System.out.println(es1 == es2);


        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
