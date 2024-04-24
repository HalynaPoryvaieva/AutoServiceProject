package entity;

public class Car {
    private String brand;
    private String model;
    private int yearOfIssue;
    private String VINcode;
    private int dateRegistrationCar;
    private int idCar;
   private static int idCarCounter=0;

    public Car(String brand, String model, int yearOfIssue, String VINcode, int dateRegistrationCar, int idCar) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.VINcode = VINcode;
        this.dateRegistrationCar = dateRegistrationCar;
        this.idCar = idCar++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getVINcode() {
        return VINcode;
    }

    public int getDateRegistrationCar() {
        return dateRegistrationCar;
    }

    public int getIdCar() {
        return idCar++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'' +
                ", yearOfIssue=" + this.yearOfIssue +
                ", VINcode='" + this.VINcode + '\'' +
                ", dateRegistrationCar=" + this.dateRegistrationCar +
                ", idCar=" + this.idCar +
                '}';
    }
}
