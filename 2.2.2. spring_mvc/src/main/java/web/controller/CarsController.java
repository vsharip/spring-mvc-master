package web.controller;

import Model.Car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Bmw", 2020, 1));
        cars.add(new Car("Mersedes", 1987, 44));
        cars.add(new Car("Volvo", 1977, 123));
        cars.add(new Car("Lada", 2021, 41));
        cars.add(new Car("Porshe", 2019, 55));
    }


    @GetMapping(value = "/cars")
    public String printCountCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            List<Car> carList = cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
            model.addAttribute("cars", carList);

            return "cars";
        }
        return "cars";
    }
}