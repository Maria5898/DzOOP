public class HotDrink extends Product {

    public HotDrink(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + getName() + '\'' +
               ", cost=" + getCost() +
               '}';
    }
}
