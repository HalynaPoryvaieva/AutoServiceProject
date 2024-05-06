package servise;

import entity.*;
import repository.OrderRepository;

import java.util.List;
import java.util.Scanner;

public class OrderServise {

    private OrderRepository orderRepository;


    public OrderServise(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Client client, Car car) {
        orderRepository.add(client, car);
    }

//    public OrderServise getOrder(int id) {
//        return orderRepository.findAll(id);
//    }

//    public boolean deleteOrder(int id) {
//        Order delOrder = orderRepository.findAll(id);
//        if (delOrder != null) {
//            orderRepository.delete(id);
//            return true;
//        }
//        return false;
//    }
//
//    public List<OrderServise> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    public void addOderTypDiagnostics(Order order, TypDiagnostics typDiagnostics){
//        order.addTypDiagnostics(typDiagnostics);
//    }
//
//    public void addOrderRepairWorks(Order order, RepairWorks repairWorks){
//        order.addRepairWorks(repairWorks);
//    }

    public void PaymentData(int priceTypDiagnostics,int priceRepairWorks){

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
}


