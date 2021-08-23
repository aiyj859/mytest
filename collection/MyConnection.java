package cn.powernode.collection;
/*
模拟集合的最简单的功能
存入一个元素
取出一个元素

利用泛型实现，存入类型和取出类型动态变化，存入类型和取出类型要一致

泛型不能直接作用于数组的数据类型,但是我们可以利用强制达到存入和取出数据类型一致的特点
 */
public class MyConnection<E> {
//    private E[] arr = new E[10];

    private Object[] arr = new Object[10];

    //存入元素时，使用泛型类型存入
    public void add(E e){
        //给数组元素赋值时，被提升为了Object类型
        arr[0] = e;
    }

    public E get(int index){
        Object o = arr[0];
        E e = (E) o;
        return e;
    }
}
