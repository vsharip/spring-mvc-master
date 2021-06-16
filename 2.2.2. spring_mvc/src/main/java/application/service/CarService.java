package application.service;

import application.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getCarsCount(List <Car> carList, Integer count);
}
