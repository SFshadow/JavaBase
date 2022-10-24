package java3;

import java2.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  1.Stream关注是运算，集合关注的是数据的存储；
 *
 *  2
 *  ①Stream自己不会存储元素
 *  ②Stream不会改变源对象，相反，他们会返回一个持有结果的新Stream。
 *  ③操作是延迟执行的。这意味着他们等到需要结果的时候才执行
 *
 *  3。Stream执行流程
 *  Stream的实例化
 *  一系列的中间操作
 *  终止操作
 *
 *  4.说明
 *  4.1 一个中间操作链，对数据源的数据进行处理
 *  4.2 一旦执行终止操作，执行中间操作链，得到结果，之后不会再被使用
 *
 */
public class StreamAPITest {

    @Test
    public void test(){

        //创建Stream方式一：通过集合
        List<EmployeeData> list=EmployeeData.getData();


        //返回一个顺序流
        Stream<EmployeeData> stream=list.stream();

        //返回一个并行流(顺序不确定)
        Stream<EmployeeData> parallelStream=list.parallelStream();

        //创建Stream方式二：通过数组
        int[] ans=new int[]{1,2,3,4};
        IntStream intStream=Arrays.stream(ans);


        //通过stream的of方法
        Stream<Integer> s4=Stream.of(1,2,3,4);


        //创建stream方式4：创造无限流
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::print);

    }
}
