package CompositePatten.Iterator;

import CompositePatten.Component.Menu;
import CompositePatten.Component.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

//外部迭代器，比内部的迭代器的实现复杂
//当然外部迭代器支持外层调用时自定义输出，拥有更强的可扩展性
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            //递归，如果这个迭代器没有子节点，则删除他查看下一个栈中的节点
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    //todo: debug and delete the debug
    @Override
    public MenuComponent next() {
        if(hasNext()) {
            //中左右顺序遍历
            Iterator<MenuComponent> iterator = stack.peek();
            //递归方法
            MenuComponent component = iterator.next();
            //如果这个组件为Menu(非叶节点)，则将其的迭代器加入栈中
            if(component instanceof Menu) {
//                System.out.println("debug: " + stack.toString() + "加入 " + component.getName());
                stack.push(component.createIterator());
            }
//            System.out.println("debug: " + stack.toString() + " 输出/头结点 " + component.getName());
            return component;
        } else return null;
    }
}
