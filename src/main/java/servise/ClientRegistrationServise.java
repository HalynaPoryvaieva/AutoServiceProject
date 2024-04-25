package servise;

import entity.Client;
import repository.ClientRegistrationRepository;

public class ClientRegistrationServise {

    private ClientRegistrationRepository repository;

    public ClientRegistrationServise(ClientRegistrationRepository repository) {
        this.repository = repository;
    }

    public void add(String name, String surname, int phone, String adresse, int dateRegistrationClient) {
        Client client = new Client(name, surname, phone, adresse, dateRegistrationClient);
        repository.add(client);
    }

    //TODO
//    public boolean update(String name, String surname, int phone, String adresse, int dateRegistrationClient, int idClient) {
//        Client newClient = repository.get(idClient);
//        if (newClient != null) {
//            newClient.update(name, surname, phone, adresse, dateRegistrationClient);
//            return true;
//        }
//        return false;
//    }

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

    //TODO add/delete property type:leasing or private
    //TODO add/delete payment type:Bank account or cash
    //TODO back???
}
