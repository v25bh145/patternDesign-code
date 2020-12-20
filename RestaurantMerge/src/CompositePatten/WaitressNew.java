package CompositePatten;

import CompositePatten.Component.MenuComponent;

import java.util.Iterator;

//新版的女服务员只负责内封装一个组件，而不知道这个组件是叶节点还是组合，聚合度更高了
public class WaitressNew {
    MenuComponent allMenus;

    public WaitressNew(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    //调用外迭代器
    //打印素食菜单
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n---");
        //todo: BUG 会打印两遍[apple pie]，调试代码找不到bug
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try{
                if(menuComponent.isVegetarian()) menuComponent.print();
            } catch(UnsupportedOperationException ignored) {}//默认规定不处理异常就需要命名为ignored的样子
        }
    }
}
