package Model;

import java.util.ArrayList;
import java.util.Iterator;

//服务员，负责传递菜单
//服务员并不知道菜单的具体内容，只负责传递功能，因此这个类是[高聚合]的
public class Waitress {
    ArrayList<Menu> menus;
    //古老方法，服务员与菜单的类型没有实现解耦
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;

//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }

//    public void printMenu() {
//        Iterator pancakeIterator = (Iterator) pancakeHouseMenu.createIterator(true);
//        Iterator dinerIterator = (Iterator) dinerMenu.createIterator(true);
////        java.util.Iterator dinerIterator2 = (java.util.Iterator)dinerMenu.createIterator(true);
//        java.util.Iterator cafeMenuIterator = (java.util.Iterator) cafeMenu.createIterator(false);
//
//
//        System.out.println("MENU\n----\nBREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//
//        printMenu(cafeMenuIterator);
//    }


    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        //        while(menuIterator.hasNext()) {
//            Menu menu = (Menu)menuIterator.next();
//            printMenu(menu.createIterator());
//        }

        //ArrayLists属于集合，可以不用Iterator而使用增强for循环
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();

            //HushTable对象的value().iterator()方法会多返回一个空的元素
            //这里我不懂为什么会多返回一个空的元素(跟哈希表有关系？
            //恳请各位懂的带佬速速联系我QAQ
            if(menuItem == null) continue;

            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
