package repository;

import entity.ClientData;

import java.util.*;

public class ClientDataRepository implements CrudObject<Integer,ClientData> {
    private Map<Integer, ClientData> clientDataMap;

    public ClientDataRepository() {
        this.clientDataMap = new HashMap<>();
    }

    @Override
    public void add(ClientData value) {
        clientDataMap.put(value.getIdClientData(),value);
    }

    @Override
    public boolean delete(Integer key) {
        clientDataMap.remove(key);
        return false;
    }

    @Override
    public ClientData get(Integer key) {
        return clientDataMap.get(key);
    }

    @Override
    public Collection<ClientData> findAll() {
        return clientDataMap.values();
    }


}
