package compoundPattern.observer;

import compoundPattern.duck.IQuackable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

//观察者中间类
//这里组合具体观察者类(以PropertyChangeListener接口变量表示)与具体的鸭子
//这个类被具体的鸭子组合
public class Observable implements IObservable {
    //PropertyChangeListener类似于Observer接口
    ArrayList<PropertyChangeListener> pcls = new ArrayList<>();
    IQuackable duck;

    public Observable(IQuackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(PropertyChangeListener pcl) {
        pcls.add(pcl);
    }

    @Override
    public void notifyObservers() {
        for(PropertyChangeListener pcl : pcls) {
            pcl.propertyChange(new PropertyChangeEvent(duck, "Proj", "OldValue", duck.toString()));
        }
    }
}
