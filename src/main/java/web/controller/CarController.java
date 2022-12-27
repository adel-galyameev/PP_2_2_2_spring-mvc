package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService service;

    @GetMapping(value = "/cars")
    public String printCar (Model modelMap, @RequestParam(value = "count", required = false,defaultValue = "5") int count) {
        if (count > 5) {
            count = 5;
        }
        List<Car> cars = service.getCarsList(count);
        modelMap.addAttribute("cars",cars);
        return "cars";

    }
    @Autowired
    public void setCarService (CarService service) {
        this.service = service;
    }
}
