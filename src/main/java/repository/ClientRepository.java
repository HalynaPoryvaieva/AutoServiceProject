package repository;

import entity.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientRepository implements CrudObject<Integer, Client> {
    private Map<Integer, Client> clientMap;

    public ClientRepository() {
        clientMap = new HashMap<>();
    }

    @Override
    public void add(Client value) {
        clientMap.put(value.getIdClient(), value);
    }

    @Override
    public boolean delete(Integer key) {
        clientMap.remove(key);
        return false;
    }

    @Override
    public Client get(Integer key) {
        return clientMap.get(key);
    }

    @Override
    public Collection<Client> findAll() {
        return clientMap.values();
    }

    public void init() {
        List<Client> clientList = List.of(
                new Client("John", "Doe", 123456789, "123 Street", 2015),
                new Client("Jane", "Smith", 987654321, "456 Avenue", 2016),
                new Client("Alice", "Johnson", 654321987, "789 Boulevard", 2017)
        );

        clientMap = clientList.stream().collect(Collectors.toMap(Client::getIdClient, client -> client));

    }
}




