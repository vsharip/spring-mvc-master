package Service;

import Model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarRepositoryImpl implements CarRepository {

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
}
