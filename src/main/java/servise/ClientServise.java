package servise;

import entity.Client;
import repository.ClientRepository;

public class ClientServise {
    private ClientRepository repository;

    public ClientServise(ClientRepository repository) {
        this.repository = repository;
    }

    public void add(String name, String surname, int phone, String adresse, int dateRegistrationClient) {
        Client client = new Client(name, surname, phone, adresse, dateRegistrationClient);
        repository.add(client);
    }

    public boolean update(String name, String surname, int phone, String adresse, int dateRegistrationClient, int idClient) {
        Client newClient = repository.get(idClient);
        if (newClient != null) {
            newClient.update(name, surname, phone, adresse, dateRegistrationClient);
            return true;
        }
        return false;
    }

    public boolean delete(int idClient) {
        Client delClient = repository.get(idClient);
        if (delClient != null) {
            repository.delete(idClient);
            return true;
        }
        return false;
    }

    public Client get(int idClient) {
        return repository.get(idClient);
    }

    public void findAll() {
        repository.findAll().forEach(System.out::println);
    }

    public void add(Client client) {
        repository.add(client);
    }
}
