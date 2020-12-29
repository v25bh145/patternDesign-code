package IteratorPattern.Iterator;

import IteratorPattern.Model.MenuItem;

import java.util.Iterator;

//实现了迭代器接口的午餐迭代器类
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
//        if(position >= items.length || items[position] == null) {
//            return false;
//        } else return true;
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
