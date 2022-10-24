package java2;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/***
 * 方法引用
 *
 * 1.当传递给lamda表达式的方法体已经有实现的方法，使用方法引用
 *
 * 2.方法引用本质上还是lamda表达式
 *
 * 3.使用格式
 * 类（对象）  ：：方法名
 *
 * 4.具体分为如下的三种情况
 * 4.1对象：：非静态方法
 * 4.2类：：静态方法
 * 4.3类：非静态方法
 *
 * 5.方法引用使用要求
 *
 *
 *
 * A接口只有一个抽象方法B，B的形参跟方法体一样，可以使用方法引用如5.1
 * A接口只有一个抽象方法B，B的形参跟第一个参数是方法体的调用者，可以使用方法引用如5.2
 *
 *
 *
 *
 *
 */
public class MethodRefTest {

    @Test
    public void test1(){

        /**5.1
         *  consumer中抽象方法accept（T t)
         *  System.out.println(T t)
         */

        Consumer<String> s1=s-> System.out.println(s);
        Consumer<String> s2=System.out::println;

        /**
         * Comparator中的CompareTo(o1,o2)
         * Integer中的compareTO  o1.compareTo()  o1作为调用者
         */
        Comparator<Integer> c1=(o1,o2)->o1.compareTo(o2);
        Comparator<Integer> c2=Integer::compareTo;
        

    }


}
