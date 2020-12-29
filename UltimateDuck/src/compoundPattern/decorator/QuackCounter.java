package compoundPattern.decorator;

import compoundPattern.duck.IQuackable;
import compoundPattern.observer.Observable;

import java.beans.PropertyChangeListener;

//装饰者模式
public class QuackCounter implements IQuackable {
    IQuackable duck;
    static int count;
    ////观察者中间类
    Observable observable;

    public QuackCounter(IQuackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        count++;

        //通知观察者
        notifyObservers();
    }

    public static int getCount() {
        return count;
    }

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
        return duck.toString();
    }
}
