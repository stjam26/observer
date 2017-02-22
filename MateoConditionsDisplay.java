/**
 * Created by laurenmateo on 2/22/17.
 */
package HW6.observer;

public class MateoConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public MateoConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Mateo Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}