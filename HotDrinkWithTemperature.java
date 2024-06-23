public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;
    private int volume;

    public HotDrinkWithTemperature(String name, double cost, int temperature, int volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrinkWithTemperature{" +
               "name='" + getName() + '\'' +
               ", cost=" + getCost() +
               ", temperature=" + temperature +
               ", volume=" + volume +
               '}';
    }
}