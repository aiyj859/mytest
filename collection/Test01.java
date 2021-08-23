package cn.powernode.collection;
/*
创建对象指定泛型的语法
1.标准语法
数据类型<泛型类型>  对象名 = new 数据类型<泛型类型>();

2.可以省略
前提：对象需要使用一个指定泛型的类型去接收
数据类型<泛型类型>  对象名 = new 数据类型<>();
可以根据左边的泛型类型自动推断出，右边的对象是什么泛型

3.细节
【1】在创建时，可以指定的数据类型只能是引用数据类型
     如果我们想要使用4类8中基本类型数据时，就要使用他们的包装类类型

【2】在创建对象时，泛型可以不指定
     如果我们不指定泛型的数据类型，则泛型会是Object类型
 */
public class Test01 {
    public static void main(String[] args) {
        Student<String> student = new Student<>();

        MyConnection<Integer> connection = new MyConnection<>();
        connection.add(666);
        Integer integer = connection.get(0);
        System.out.println(integer);
    }
}
