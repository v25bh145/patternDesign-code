package subject;

import java.util.ArrayList;
import observer.IObserver;

public class WeatherData implements ISubject {
    //主题类需要维护一个观察者数组，类型为抽象接口类，这里实现了松耦合
    private final ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //初始化
    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //设置数据时即改变一次
        measurementsChanges();
    }
    //规定当天气数据改变时调用这个方法(不用管怎么调用的)
    public void measurementsChanges() {
        //通知观察者
        notifyObservers();
    }

    //注意IObserver的类型，别使用成了java内部的observer
    //这是subject接口的实现
    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(IObserver o) {
        int i = observers.indexOf(o);
        if(i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (IObserver iObserver : observers) {
            iObserver.update(temperature, humidity, pressure);
        }
    }

}
