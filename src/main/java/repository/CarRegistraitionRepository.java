package repository;

import entity.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRegistraitionRepository implements RegistrationObject<Integer, Car> {

    private Map<Integer,Car>carMap;

    public CarRegistraitionRepository(){
        carMap=new HashMap<>();
    }

    //TODO all method

    @Override
    public void add(Car value) {

    }

    @Override
    public void update(Integer key, Car value) {

    }

    @Override
    public void delete(Integer key) {

    }

    @Override
    public Car get(Integer key) {
        return null;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}
