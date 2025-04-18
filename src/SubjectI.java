import java.util.List;

public interface SubjectI {
    void registerObserver(ObserverI observer);
    void unregisterObserver(ObserverI observer);
    void notifyObservers();
}
