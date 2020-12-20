package Iterator;

//迭代器接口(抽象)
//自己实现的迭代器，与java自带的迭代器少了个remove方法
//在Model中使用了JAVA自带的迭代器
public interface Iterator {
    boolean hasNext();
    Object next();
}
