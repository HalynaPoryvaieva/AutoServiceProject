package entity;

public class Client {
    private String name;
    private String surname;
    private int phone;
    private String adresse;
    private int dateRegistrationClient;
    private int idClient;
    private static int idClientCounter=0;

    public Client(String name, String surname, int phone, String adresse, int dateRegistrationClient) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.adresse = adresse;
        this.dateRegistrationClient = dateRegistrationClient;
        this.idClient=++ idClientCounter;
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
        return adresse;
    }

    public int getDateRegistrationClient() {
        return dateRegistrationClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAdrsse(String adrsse) {
        this.adresse = adrsse;
    }

    public void setDateRegistrationClient(int dateRegistrationClient) {
        this.dateRegistrationClient = dateRegistrationClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", adrsse='" + adresse + '\'' +
                ", dateRegistration=" + dateRegistrationClient +
                ", idClient=" + idClient +
                '}';
    }
}
