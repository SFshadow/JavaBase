import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

/***
 * 随机读取文件RandomAccessFile测试
 * 1.既可以做输出也可以做输入
 * 2.
 */
public class RandomAccessFileTest {

    @Test
    public void test1(){
        RandomAccessFile randomAccessFile= null;
        RandomAccessFile randomAccessFile1=null;
        try {
            randomAccessFile = new RandomAccessFile("object.dat","r");
            randomAccessFile1=new RandomAccessFile("object1.dat","rw");
            byte[] buffer=new byte[1024];
            int len;
            while ((len=randomAccessFile.read(buffer))!=-1){
                randomAccessFile1.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(randomAccessFile!=null) randomAccessFile.close();
                if(randomAccessFile1!=null) randomAccessFile1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





    }

    /**
     * RandomAccessFile 写操作就是覆盖
     * 1.
     */
    @Test
    public void test2(){
        RandomAccessFile r=null;
        try {
        r=new RandomAccessFile("hello.txt","rw");

        ///r.write("xyz".getBytes());
        r.seek(r.length());
        r.write("555".getBytes());


        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            try {
               if(r!=null)  r.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
