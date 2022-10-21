package java1;

import org.junit.Test;

import java.util.function.Consumer;

/***
 * Lamba表达式：
 *  （）->  {xxx}
 *     ->:lamba操作符或箭头操作符
 *     左边：；lamba表达式的参数列表（其实就是接口的抽象方法的形参列表）
 *     右边：lamba体（其实就是重写的抽象方法的方法体）
 *
 *  3.lamba表达式的使用：分为6种情况
 *
 *  4.lamba表达式的本质：作为接口的实例
 *
 *
 */
public class LambaTest1 {

    @Test
    public  void test(){

        //语法格式1：无参，无返回值
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        r1.run();
        Runnable r2=()-> {System.err.println("1");};
        r2.run();

        //语法格式2：需要一个参数，但是没有返回值
        Consumer<String> con=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("2");
        Consumer<String> con2=(String s)-> {System.err.println(s);};
        con2.accept("2");

        //语法3：数据类型可以省略,可有编译器推断
        Consumer<String> con3=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con3.accept("3");
        Consumer<String> con3_3=(s)-> {System.err.println(s);};
        con3_3.accept("3");

        //语法格式4：若lamba只需要一个参数，小括号也可以省略
        Consumer<String> con4=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con4.accept("4");
        Consumer<String> con4_4=(s)-> System.err.println(s);
        con4_4.accept("4");







    }

}
