package repository;

import entity.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientRegistrationRepository implements RegistrationObject<Integer, Client> {
    private Map<Integer,Client> clientMap;

    public ClientRegistrationRepository(){
        clientMap=new HashMap<>();
    }

    @Override
    public void add(Client value) {
        clientMap.put(value.getIdClient(), value);
    }

    @Override
    public void update(Integer key, Client value) {
        clientMap.compute(value.getIdClient(), (idCar,newClient) -> {
            if (newClient != null) {
                return value;
            } else {
                return value;
            }
        });

    }

    @Override
    public void delete(Integer key) {
        clientMap.remove(key);
    }

    @Override
    public Client get(Integer key) {
        return clientMap.get(key);
    }

    @Override
    public Collection<Client> findAll() {
        return clientMap.values();
    }
}




