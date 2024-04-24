package entity;

public class Client {
    private String name;
    private String surname;
    private int phone;
    private String adrsse;
    private int dateRegistrationClient;
    private int idClient;
    private static int idClientCounter=0;

    public Client(String name, String surname, int phone, String adrsse, int dateRegistration, int idClient) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.adrsse = adrsse;
        this.dateRegistrationClient = getDateRegistrationClient();
        this.idClient = ++idClient;
    }

    public void update(String name,String surname,int phone,String adrsse,int dateRegistration){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.adrsse = adrsse;
        this.dateRegistrationClient = dateRegistrationClient;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone() {
        return phone;
    }

    public String getAdrsse() {
        return adrsse;
    }

    public int getDateRegistrationClient() {
        return dateRegistrationClient;
    }

    public int getIdClient() {
        return idClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", adrsse='" + adrsse + '\'' +
                ", dateRegistration=" + dateRegistrationClient +
                ", idClient=" + idClient +
                '}';
    }
}
