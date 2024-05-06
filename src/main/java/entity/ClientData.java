package entity;


import java.util.List;
import java.util.Map;

public class ClientData {
    private int idClientData;
    private List<Car> carList;
    private List<Client> clientList;
    private Map<Integer, List<Car>> clientCarsMap;
    private static int idClientDataCounter = 0;

    public ClientData(int idClientData, Client client, List<Car> carList) {
        this.idClientData = ++idClientDataCounter;
        this.carList = this.carList;
        this.clientList = clientList;
        this.clientCarsMap = clientCarsMap;
    }

    public int getIdClientData() {
        return idClientData;
    }

    public void setIdClientData(int idClientData) {
        this.idClientData = idClientData;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public Map<Integer, List<Car>> getClientCarsMap() {
        return clientCarsMap;
    }

    public void setClientCarsMap(Map<Integer, List<Car>> clientCarsMap) {
        this.clientCarsMap = clientCarsMap;
    }

    public static int getIdClientDataCounter() {
        return idClientDataCounter;
    }

    public static void setIdClientDataCounter(int idClientDataCounter) {
        ClientData.idClientDataCounter = idClientDataCounter;
    }

    @Override
    public String toString() {
        return "ClientData{" +
                "idClientData=" + idClientData +
                ", carList=" + carList +
                ", clientList=" + clientList +
                ", clientCarsMap=" + clientCarsMap +
                '}';
    }
}
