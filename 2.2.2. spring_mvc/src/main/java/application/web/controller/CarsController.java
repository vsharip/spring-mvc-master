package application.web.controller;


import application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String printCountCars(@RequestParam(value = "count", required = false) Integer count,
                                 Model model) {
        List<?> newCarList = carService.getCarsCount(carService.listCar(), count);
        model.addAttribute("cars", newCarList);
        return "cars";
    }
}