package IteratorPatten.Model;

import java.util.Iterator;

//作用: 将服务员与具体餐厅的菜单解耦
public interface Menu {
    //在Model中使用了JAVA自带的迭代器接口
    public Iterator<MenuItem> createIterator();
}
