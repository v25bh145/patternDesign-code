package compoundPattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

//一个具体的观察者类
public class ChangeListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Hear The Duck Quark: " + evt.getNewValue());
    }
}
