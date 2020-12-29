package compoundPattern.duck;

import compoundPattern.observer.Observable;

import java.beans.PropertyChangeListener;

public class RobberDuck implements IQuackable {
    //观察者中间类
    Observable observable;

    public RobberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");

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
        return "RobberDuck";
    }
}
