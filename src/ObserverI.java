import java.util.Observable;

public interface ObserverI {
    public void update(float temperature, float humidity, float pressure);
}
