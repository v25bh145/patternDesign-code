package IteratorPatten.Iterator;

import IteratorPatten.Model.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

//实现了迭代器接口的煎饼迭代器类
//扩展了JAVA自带的迭代器接口，没有使用自己实现的接口
public class PancakeHouseIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
