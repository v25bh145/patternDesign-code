package CompositePatten.Component;

import java.util.Iterator;

//组合模式，允许树形结构
//由于我们希望在这里提供一些默认实现(抛出异常)，因此使用了抽象类而不是接口
//这里违反了透明性，这个抽象类有两个职责，但是换取了透明性
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public Double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    //外迭代器
    public abstract Iterator<MenuComponent> createIterator();
}
