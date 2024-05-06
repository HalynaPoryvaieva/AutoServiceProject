package repository;

import entity.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarRepository implements CrudObject<Integer, Car> {

    private Map<Integer, Car> carMap;

    public CarRepository() {
        carMap = new HashMap<>();
    }

    @Override
    public void add(Car value) {
        carMap.put(value.getIdCar(), value);
    }

    @Override
    public boolean delete(Integer key) {
        carMap.remove(key);

        return false;
    }

    @Override
    public Car get(Integer key) {
        return carMap.get(key);
    }

    @Override
    public Collection<Car> findAll() {
        return carMap.values();
    }

    public void init() {
        List<Car> carList = List.of(
                new Car(1, "Toyota", "Camry", 2015, "VIN123456789", 2016),
                new Car(2, "Honda", "Accord", 2018, "VIN987654321", 2019),
                new Car(3, "Ford", "Focus", 2017, "VIN456789123", 2018)
        );

        carMap = carList.stream().collect(Collectors.toMap(Car::getIdCar, car -> car));
    }
}