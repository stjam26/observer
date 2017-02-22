/**
 * Created by johngleason on 2/22/17.
 */
package HW6.observer;

public class GleasonConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public GleasonConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Gleason Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
