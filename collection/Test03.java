package cn.powernode.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
先学习Collection接口
因为该接口中的这些方法都是共性方法

Collection 变量 = new 实现类对象();
多态的写法，对象只能调用左边接口中的方法，无法调用右边实现类对象的独有方法

共性方法
boolean add(E e) 确保此 collection 包含指定的元素（可选操作）。
说明：添加方法的返回值，如果你创建的是List接口的实现类对象，返回值永远为true,允许添加重复元素，无论何时都是添加成功
      如果你创建的是Set接口下的实现类对象，不允许出现重复元素的，如果添加重复元素会返回false


boolean addAll(Collection<? extends E> c) 将指定 collection 中的所有元素都添加到此 collection 中（可选操作）。

Collection<? extends E> 要添加的集合的泛型类型，是接收的集合的泛型类型同等类型或者他的子类

void clear() 移除此 collection 中的所有元素（可选操作）。

boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true。

boolean isEmpty() 如果此 collection 不包含元素，则返回 true。

boolean remove(Object o) 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
只会移除出现的第一个元素

int size() 返回此 collection 中的元素数。

Object[] toArray() 返回包含此 collection 中所有元素的数组。


<T> T[] toArray(T[] a) 返回包含此 collection 中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。
在方法参数的位置，指定一个类型的数组，返回一个和你类型相同的数组
【1】你如果指定的数组长度大于集合元素的长度，就使用你的数组装这些集合中的元素
【2】如果你指定的数组长度小于集合中的元素的长度，只用你的类型，创建一个新的数组来装集合中的元素

 */
public class Test03 {
    public static void main(String[] args) {
        //创建好了集合对象，左边时顶层接口，右边是 实现类对象
        Collection<String> collection = new ArrayList<>();

        //boolean add(E e)
        collection.add("java");
        collection.add("hello");
        collection.add("world");
        collection.add("javaweb");
        collection.add("java");

//        System.out.println(collection);

        //boolean addAll(Collection<? extends E> c)
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("python");
        collection2.add("C++");
        collection.addAll(collection2);

        System.out.println(collection);

        //void clear()
//        collection.clear();
//        System.out.println(collection);

        //boolean contains(Object o)
       /* boolean flag = collection.contains("javaee");
        System.out.println(flag);*/

       //boolean isEmpty()
       /* System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.isEmpty());*/

        //boolean remove(Object o)
        /*collection.remove("java");
        System.out.println(collection);*/

        //int size()
        /*int size = collection.size();
        System.out.println(size);*/

        //Object[] toArray()
//        Object[] objects = collection.toArray();
        /*for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }*/

        //<T> T[] toArray(T[] a)
       /* String[] arr = new String[9];
        String[] strings = collection.toArray(arr);
        System.out.println(Arrays.toString(strings));*/

        /*String[] arr = new String[5];
        String[] strings = collection.toArray(arr);
        System.out.println(Arrays.toString(strings));*/
    }
}
