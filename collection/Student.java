package cn.powernode.collection;
/*
泛型

语法：
public class 类名<泛型占位符>
泛型占位符，在当前这个类中就可以充当一个未知的数据类型
虽然叫什么都可以，但是一般泛型占位符需要做到见名知义

在一个普通的类中，表示一个未知的数据类型 一般用Type  T
在一个单列集合中，表示未知的数据类型  Element   E
在一个双列集合中，表示未知数据类型  Key  Value   K V
这些表示已经成为行业的不成文规定了
 */
public class Student<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
