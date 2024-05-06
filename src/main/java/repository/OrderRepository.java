package repository;

import entity.Car;
import entity.Client;
import entity.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository implements CrudObject<Integer, Order> {
    private Map<Integer,Order> orderMap;

    public OrderRepository(){
        orderMap=new HashMap<>();
    }

    @Override
    public void add(Order value) {
        orderMap.put(value.getId(),value);
    }

    @Override
    public boolean delete(Integer key) {
        orderMap.remove(key);
        return false;
    }

    @Override
    public Order get(Integer key) {
        return orderMap.get(key);
    }

    @Override
    public Collection<Order> findAll() {
        return orderMap.values();
    }


    public void add(Client client, Car car) {
        return orderMap.put(client,car);
    }
}
