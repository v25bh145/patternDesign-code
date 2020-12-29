package CompositePattern.Component;

import CompositePattern.Iterator.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
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
    public Double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println("name " + getName() + " " + (isVegetarian() ? "(v)" : "") + ", " + getPrice() + " -- " + getDescription());
    }

    //外迭代器
    @Override
    public Iterator<MenuComponent> createIterator() {
        //我们有两种选择
        //1. 返回null，需要在客户代码判断
        //2. 返回一个迭代器，hasNext()永远返回false => 空迭代器
        return new NullIterator();
    }
}
