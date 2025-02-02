package assic;

import java.util.ArrayList;
import java.util.List;

class CarDealership {
    private String name;
    private List<Car> cars;

    public CarDealership(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car findCarByBrand(String brandName) {
        for (Car car : cars) {
            if (car.getBrandName().equalsIgnoreCase(brandName)) {
                return car;
            }
        }
        return null;
    }
}

