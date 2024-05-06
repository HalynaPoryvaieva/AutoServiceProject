package entity;

public class Car {
    private int idCar;
    private String brand;
    private String model;
    private int yearOfIssue;
    private String VINcode;
    private int dateRegistrationCar;
    private PropertyType propertyType;
   private static int idCarCounter=0;

    public Car(int idCar, String brand, String model, int yearOfIssue, String VINcode, int dateRegistrationCar) {
        this.idCar = ++idCarCounter;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.VINcode = VINcode;
        this.dateRegistrationCar = dateRegistrationCar;
        this.propertyType=propertyType;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setVINcode(String VINcode) {
        this.VINcode = VINcode;
    }

    public void setDateRegistrationCar(int dateRegistrationCar) {
        this.dateRegistrationCar = dateRegistrationCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", VINcode='" + VINcode + '\'' +
                ", dateRegistrationCar=" + dateRegistrationCar +
                ", propertyType=" + propertyType +
                '}';
    }

    public void update(String brand, String model, int yearOfIssue, String viNcode, int dateRegistrationCar) {
        //TODO
    }
}
