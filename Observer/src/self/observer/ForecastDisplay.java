package self.observer;

import self.subject.ISubject;

public class ForecastDisplay implements IObserver {
    private float temperature;
    private float humidity;
    private float pressure;

    //观察者需要有一个指向主题的指针(引用)，方便订阅/取消订阅
    private ISubject weatherData;

    public ForecastDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        //在构造函数注册一个订阅
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Forecast: temperature " + temperature + "F humidity " + humidity + "% pressure" + pressure + "pa");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
