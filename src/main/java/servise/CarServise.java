package servise;

import entity.Car;
import entity.PropertyType;
import repository.CarRepository;

public class CarServise {

    private CarRepository repository;

    public CarServise(CarRepository repository) {
        this.repository = repository;
    }

    public void add(int idCar, String brand, String model, int yearOfIssue, String VINcode, int dateRegistrationCar) {
        Car car = new Car(idCar, brand, model, yearOfIssue, VINcode, dateRegistrationCar);
        repository.add(car);
    }

    public boolean updata(int idCar, String brand, String model, int yearOfIssue, String VINcode, int dateRegistrationCar) {
        Car newCar = repository.get(idCar);
        if (newCar != null) {
            newCar.update(brand, model, yearOfIssue, VINcode, dateRegistrationCar);
            return true;
        }
        return false;
    }

    public boolean delete(int idCar) {
        Car delCar = repository.get(idCar);
        if (delCar != null) {
            repository.delete(idCar);
            return true;
        }
        return false;
    }

    public Car get(int idCar) {
        return repository.get(idCar);
    }

    public void findAll() {
        repository.findAll().forEach(System.out::println);
    }

    public boolean updatePropertyType(int idCar, String propertyType) {
        Car car = repository.get(idCar);
        if (car != null) {
            car.setPropertyType(PropertyType.valueOf(propertyType.toUpperCase()));
            return true;
        }
        return false;
    }

    public void add(Car car) {
        repository.add(car);
    }
}
