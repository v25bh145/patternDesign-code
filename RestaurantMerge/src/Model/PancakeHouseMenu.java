package Model;

import Iterator.PancakeHouseIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, add toast", true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.88);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //实现了迭代器之后就不需要将内部的对象开放了
//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    //迭代器与模型类之间以组合形式联系
    @Override
    public Iterator<MenuItem> createIterator() {
        //这里使用的接口是扩展JAVA迭代器接口的类([可以理解成适配器])
        return new PancakeHouseIterator(menuItems);
    }
}
