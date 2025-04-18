package WeatherStation;

import WeatherStation.Interface.ObserverI;
import WeatherStation.Interface.SubjectI;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SubjectI {
    private List<ObserverI> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverI observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(ObserverI observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverI observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
