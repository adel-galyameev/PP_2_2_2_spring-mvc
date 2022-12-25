package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImpl  implements CarService{
    @Override
    public List<Car> getCarsList(int a) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Camry","Black", 953));
        cars.add(new Car("Polo", "White",777));
        cars.add(new Car("Actavia","Blue", 326));
        cars.add(new Car("Rapid", "Green", 699));
        cars.add(new Car("Vesta", "Red", 529));
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
