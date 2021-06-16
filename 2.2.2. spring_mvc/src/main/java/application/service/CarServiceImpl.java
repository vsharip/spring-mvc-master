package application.service;

import application.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsCount(List<Car> carList, Integer count) {
        if (count == null) {
            return carList;
        } else {
            return carList.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }

    public List<Car> listCar() {
        return cars;
    }

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Bmw", 2020, 1));
        cars.add(new Car("Mersedes", 1987, 44));
        cars.add(new Car("Volvo", 1977, 123));
        cars.add(new Car("Lada", 2021, 41));
        cars.add(new Car("Porshe", 2019, 55));
    }
}