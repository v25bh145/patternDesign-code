package observer;

import subject.ISubject;

public class CurrentConditionsDisplay implements IObserver {
    private float temperature;
    private float humidity;
    //观察者需要有一个指向主题的指针(引用)，方便订阅/取消订阅
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        //在构造函数注册一个订阅
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }
}
