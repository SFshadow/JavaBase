import org.junit.Test;

import java.io.*;

/**
 * 对象输入流和输出流的使用
 *
 * 对象实现序列化需要满足一定条件
 * 1.实现Serializable接口
 * 2.提供一个全局常量serialVersionUID,serialVersionUID的值没有特别关系,作为版本控制，以防后面类修改找不回对应的新版本
 * 3.保证所有属性也能序列化
 *
 */
public class ObjectInputOutStreamTest {


    /**
     * 序列化过程
     */
    @Test
    public void testObjectOutStream(){

        ObjectOutputStream oos= null;
        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            //2.
            oos.writeObject(new String("抽爆妮露"));
            oos.writeObject(new Person("妮露",18));

            //3.
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    /**
     * 反序列化
     */
    @Test
    public void testObJectInputStream(){
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj=ois.readObject();

            String str=(String)obj;
            Person p=(Person)ois.readObject();

            System.err.println(str);
            System.err.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois!=null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
