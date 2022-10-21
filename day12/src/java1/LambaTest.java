package java1;

import org.junit.Test;

import java.util.Comparator;

public class LambaTest {

    @Test
    public void test(){

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.err.println("妮露是我小老婆");
            }
        };
        runnable.run();

        Runnable runnable1=()->{
            System.err.println("胡桃是大老婆");
        };
        runnable1.run();

        Comparator<Integer> comparable=(o1,o2)-> Integer.compare(o1,o2);
        System.err.println(comparable.compare(10,20));

    }


}
