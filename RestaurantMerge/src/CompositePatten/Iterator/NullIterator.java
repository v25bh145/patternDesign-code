package CompositePatten.Iterator;

import CompositePatten.Component.MenuComponent;

import java.util.Iterator;

//一个空的外迭代器，用于MenuItem的createIterator()
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
