package repository;

import entity.Car;
import entity.Client;
import entity.Order;
import servise.OrderServise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository implements CrudObject<Integer, Order> {
    private Map<Client,Car> orderMap;
    private Map<Integer,Order> integerOrderMap;

    public OrderRepository(){
        orderMap=new HashMap<>();
        integerOrderMap=new HashMap<>();
    }

    @Override
    public void add(Order value) {
        integerOrderMap.put(value.getId(),value);

    }

    @Override
    public boolean delete(Integer key) {
        orderMap.remove(key);
        return false;
    }

    @Override
    public Order get(Integer key) {
        return integerOrderMap.get(key);
    }

    public Order getOrder(Client client) {
        return integerOrderMap.get(client);
    }

    @Override
    public Collection<Order> findAll() {
        return integerOrderMap.values();
    }


    public void add(Client client, Car car) {
         orderMap.put(client,car);
    }

}
