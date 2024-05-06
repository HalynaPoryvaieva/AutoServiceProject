package servise;

import entity.Car;
import entity.Client;
import repository.OrderRepository;

import java.util.List;

public class Order {
    private OrderRepository orderRepository;


    public Order(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

//    public void addOrder(Client client, Car car) {
//        orderRepository.add(client, car);
//    }
//
//    public Order getOrder(int idOrder) {
//        return orderRepository.findAll(idOrder);
//    }
//
//    public boolean deleteOrder(int idOrder) {
//        return orderRepository.delete(idOrder);
//    }
//
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }






}
