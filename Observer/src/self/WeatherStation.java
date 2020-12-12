package self;

import self.observer.CurrentConditionsDisplay;
import self.observer.ForecastDisplay;
import self.observer.HeatIndex;
import self.subject.WeatherData;

public class WeatherStation {
    //测试程序
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndex heatIndex = new HeatIndex(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
