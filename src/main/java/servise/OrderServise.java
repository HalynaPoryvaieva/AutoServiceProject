package servise;

import entity.*;
import repository.OrderRepository;

import java.util.List;
import java.util.Scanner;

public class OrderServise {

    private OrderRepository orderRepository;
    private ClientServise clientServise;

    private CarServise carServise;


    public OrderServise(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Client client, Car car) {
        orderRepository.add(client, car);
        clientServise.add(client);
        carServise.add(car);
    }

    public Order getOrder(int id) {
        return orderRepository.get(id);
    }

        public boolean deleteOrder(int id) {
        Order delOrder = orderRepository.get(id);
        if (delOrder != null) {
            orderRepository.delete(id);
            return true;
        }
        return false;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll().stream().toList();
    }

    public void addOderTypDiagnostics(Order order, List<TypDiagnostics> diagnostics){
        order.addTypDiagnostics(diagnostics);
    }

    public void addOrderRepairWorks(Order order,int numberRepairWorks,List<RepairWorks> works){
        order.addRepairWorks(works);

    }
    public void print() {
        orderRepository.findAll().forEach(System.out::println);
        }

    public void PaymentData(int priceTypDiagnostics, int priceRepairWorks) {

        int totalPrice = priceTypDiagnostics + priceRepairWorks;
        System.out.println("Amount for diagnostics:" + priceTypDiagnostics);
        System.out.println("Amount for repair work: " + priceRepairWorks);
        System.out.println("Total amount to be paid: " + totalPrice);
    }

    public boolean processPayment(int totalPrice) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total amount to be paid: ");
        int enteredAmount = scanner.nextInt();

        if (enteredAmount == totalPrice) {
            System.out.println("Payment successful!");
            return true;
        } else {
            System.out.println("Incorrect amount entered. Payment failed.");
            return false;
        }
    }

    public void addOrderRepairWorks(Order order, int numberRepairWorks) {
        order.addRepairWorks(numberRepairWorks);
    }

}


