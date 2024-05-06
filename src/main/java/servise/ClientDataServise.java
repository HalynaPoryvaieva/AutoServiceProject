package servise;

import entity.Car;
import entity.Client;
import entity.ClientData;
import repository.ClientDataRepository;

import java.util.List;

public class ClientDataServise {
    private ClientDataRepository repository;

    public ClientDataServise(ClientDataRepository repository) {
        this.repository = repository;
    }

    public void add(int idClientData, List<Car> carList, List<Client> clientList) {
        if (idClientData >= 0 && idClientData < clientList.size()) {
            ClientData clientData = new ClientData(idClientData, clientList.get(idClientData), carList);
            repository.add(clientData);
        } else {
            System.out.println("Incorrect client identifier");
        }
    }

    public boolean delete(int idClientData) {
        ClientData clientData = repository.get(idClientData);
        if (clientData != null) {
            repository.delete(idClientData);
            return true;
        } else {
            System.out.println("No information about the client was found");
            return false;
        }
    }

    public void addCarToClient(int clientId, Car car) {
        ClientData clientData = repository.get(clientId);
        if (clientData != null) {
            clientData.getCarList().add(car);
        } else {
            System.out.println("Client information not found");
        }
    }

    public List<Car> getCarsByClientId(int clientId) {
        ClientData clientData = repository.get(clientId);
        if (clientData != null) {
            return clientData.getCarList();
        } else {
            System.out.println("Client information not found");
            return null;
        }
    }

    public void removeCarFromClient(int clientId, Car car) {
        ClientData clientData = repository.get(clientId);
        if (clientData != null) {
            clientData.getCarList().remove(car);
        } else {
            System.out.println("Client information not found");
        }
    }
}