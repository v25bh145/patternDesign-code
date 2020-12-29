package compoundPattern.observer;

import java.beans.PropertyChangeListener;

//鸭子遵循的接口的父接口
//[与书上的Observer有区别，我们使用PropertyChangeListener代替Observer]
public interface IObservable {
    public void registerObserver(PropertyChangeListener pcl);
    public void notifyObservers();
}
