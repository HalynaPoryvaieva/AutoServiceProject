package repository;

import entity.Car;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarRegistraitionRepository implements RegistrationObject<Integer, Car> {

    private Map<Integer, Car> carMap;

    public CarRegistraitionRepository() {
        carMap = new HashMap<>();
    }

    @Override
    public void add(Car value) {
        carMap.put(value.getIdCar(), value);
    }

    @Override
    public void update(Integer key, Car value) {
        carMap.compute(value.getIdCar(), (idCar, newCar) -> {
            if (newCar != null) {
                return value;
            } else {
                return value;
            }
        });
    }

    @Override
    public void delete(Integer key) {
        carMap.remove(key);

    }

    @Override
    public Car get(Integer key) {
        return carMap.get(key);
    }

    @Override
    public Collection<Car> findAll() {
        return carMap.values();
    }
}
