package Service;

import Model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> getCarsCount(List <Car> carList, Integer count);
    }
