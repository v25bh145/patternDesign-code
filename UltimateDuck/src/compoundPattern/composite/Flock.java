package compoundPattern.composite;

import compoundPattern.duck.IQuackable;
import compoundPattern.observer.Observable;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

//组合模式，那来与适配器&装饰者对比对比，其实还是很相似的(都使用了组合)
public class Flock implements IQuackable {
    ArrayList<IQuackable> ducks;

    //观察者中间类
    public Observable observable;

    public Flock(ArrayList<IQuackable> ducks) {
        this.ducks = ducks;
        observable = new Observable(this);
    }

    public Flock() {
        this.ducks = new ArrayList<>();
        observable = new Observable(this);
    }

    public void add(IQuackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        //迭代器模式
        for ( IQuackable duck : ducks) {
            duck.quack();
        }

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
        return "Flock";
    }
}
