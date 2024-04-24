package repository;

import entity.Client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientRegistrationRepository implements RegistrationObject<Integer, Client> {
    private Map<Integer,Client> clientMap;

    public ClientRegistrationRepository(){
        clientMap=new HashMap<>();
    }

//TODO all method
    @Override
    public void add(Client value) {

    }

    @Override
    public void update(Integer key, Client value) {

    }

    @Override
    public void delete(Integer key) {

    }

    @Override
    public Client get(Integer key) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}




