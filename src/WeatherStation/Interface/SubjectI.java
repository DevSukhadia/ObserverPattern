package WeatherStation.Interface;

public interface SubjectI {
    void registerObserver(ObserverI observer);
    void unregisterObserver(ObserverI observer);
    void notifyObservers();
}
