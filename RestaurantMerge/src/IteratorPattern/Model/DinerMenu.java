package IteratorPattern.Model;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, add toast", true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.88);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) System.err.println("Sorry, menu is full! Can't add item to menu");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    //实现了迭代器之后就不需要将内部的对象开放了
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    //迭代器与模型类之间以组合形式联系
    @Override
    public Iterator<MenuItem> createIterator() {
        //JAVA自带的迭代器(接口差不多，remove如果不想实现可以抛出[OperationNotSupportedException]异常
        return Arrays.stream(menuItems).iterator();
    }
}
