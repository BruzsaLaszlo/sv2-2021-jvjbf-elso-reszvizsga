package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {

        if (car.getPrice() <= maxPrice) {
            return cars.add(car);
        }

        return false;
    }

    public double sumCarPrice() {

        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }

        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {

        int count = 0;
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                count++;
            }
        }

        return count;
    }

    public  List<Car> carsWithBrand(String brand) {

        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                list.add(car);
            }
        }

        return list;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}
