import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> products;

    public HotDrinksVendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();

        // Инициализация горячих напитков
        HotDrinkWithTemperature coffeeSmall = new HotDrinkWithTemperature("Coffee", 2.99, 75, 250);
        HotDrinkWithTemperature coffeeLarge = new HotDrinkWithTemperature("Coffee", 3.99, 75, 350);
        HotDrinkWithTemperature teaSmall = new HotDrinkWithTemperature("Tea", 1.99, 80, 200);
        HotDrinkWithTemperature teaLarge = new HotDrinkWithTemperature("Tea", 2.49, 80, 300);

        // Добавление напитков в автомат
        machine.addProduct(coffeeSmall);
        machine.addProduct(coffeeLarge);
        machine.addProduct(teaSmall);
        machine.addProduct(teaLarge);

        // Получение напитков из автомата
        HotDrinkWithTemperature coffee = machine.getProduct("Coffee", 250, 75);
        System.out.println(coffee);

        HotDrinkWithTemperature tea = machine.getProduct("Tea", 300, 80);
        System.out.println(tea);

        HotDrinkWithTemperature nonExistent = machine.getProduct("Tea", 250, 80);
        System.out.println(nonExistent != null ? nonExistent : "Product not found");
    }
}
