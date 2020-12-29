package compoundPattern.goose;

import compoundPattern.duck.IQuackable;
import compoundPattern.observer.Observable;

import java.beans.PropertyChangeListener;

//适配器模式，将鹅变成鸭子
public class DuckGooseAdapter implements IQuackable {
    Goose goose;
    //观察者中间类
    Observable observable;

    public DuckGooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();

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
        return "DuckGooseAdapter";
    }
}
