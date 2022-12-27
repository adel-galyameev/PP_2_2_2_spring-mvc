package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiseImpl  implements CarService{

    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Camry","Black", 953));
        cars.add(new Car("Polo", "White",777));
        cars.add(new Car("Actavia","Blue", 326));
        cars.add(new Car("Rapid", "Green", 699));
        cars.add(new Car("Vesta", "Red", 529));
    }
    @Override
    public List<Car> getCarsList(int a) {
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}
