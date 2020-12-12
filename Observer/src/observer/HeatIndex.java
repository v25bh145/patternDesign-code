package observer;

import subject.ISubject;

public class HeatIndex implements IObserver {
    private float heatIndex;

    //观察者需要有一个指向主题的指针(引用)，方便订阅/取消订阅
    private ISubject weatherData;

    public HeatIndex(ISubject weatherData) {
        this.weatherData = weatherData;
        //在构造函数注册一个订阅
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("headIndex: " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.heatIndex = (float)((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity) +
                (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity)) +
                (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
                (0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) +
                (0.000000197483 * (temp * humidity * humidity * humidity)) - (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
                0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity)));

        display();
    }
}
