package CompositePattern.Component;

import CompositePattern.Iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() + ", " + getDescription());
        System.out.println("-----------");

        //使用迭代器(组合模式中使用迭代器是非常常见的，这也是在这里同时介绍这两种模式的原因)
        //这里是内迭代器的实现，其他地方都是外迭代器
//        IteratorPatten.Iterator.Iterator<MenuComponent> iterator = menuComponents.iterator();
//        while(iterator.hasNext()) {
//            MenuComponent menuComponent = iterator.next();
//            menuComponent.print();
//        }
        //由于是ArrayList，可以替换为增强for
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    //外迭代器
    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
