package compoundPattern.duck;

import compoundPattern.observer.ChangeListener;
import compoundPattern.observer.Observable;

import java.beans.PropertyChangeListener;

public class MallardDuck implements IQuackable {
    //观察者中间类
    Observable observable;

    public MallardDuck() {
        //给PropertyChangeListener抽象接口变量赋值一个具体的观察者类
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");

        //通知观察者
        notifyObservers();
    }

    //观察者中间类
    @Override
    public void registerObserver(PropertyChangeListener pcl) {
        observable.registerObserver(pcl);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
