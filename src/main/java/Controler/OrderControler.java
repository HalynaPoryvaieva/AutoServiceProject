package Controler;

import entity.*;
import repository.RepairWorksRepository;
import repository.TypDiagmosticsRepository;
import servise.*;

import java.util.List;
import java.util.Scanner;

public class OrderControler {
    private OrderServise orderServise;
    private ClientServise clientServise;
    private CarServise carServise;
    private TypDiagmosticsServise typDiagmosticsServise;
    private RepairWorksServise repairWorksServise;
    private Scanner scanner;

    public OrderControler(OrderServise orderServise, ClientServise clientServise, CarServise carServise, TypDiagmosticsServise typDiagmosticsServise, RepairWorksServise repairWorksServise, Scanner scanner) {
        this.orderServise = orderServise;
        this.clientServise = clientServise;
        this.carServise = carServise;
        this.typDiagmosticsServise = typDiagmosticsServise;
        this.repairWorksServise = repairWorksServise;
        this.scanner = scanner;
    }

    public void run() {
        char str;
        int id;
        do {
            System.out.println("Oder service:[a]dd,[d]elete,[p]rint,[b]ack:");
            str = scanner.nextLine().charAt(0);
            switch (str) {
                case 'a':
                    System.out.println("Oder service: addOrder:client id:)");
                    id = Integer.valueOf(scanner.nextLine());
                    Client client = clientServise.get(id);
                    Car car = carServise.get(id);
                    orderServise.addOrder(client, car);
                    break;
                case 'd':
                    System.out.println("Order service: deleteOrder: order id: ");
                    id = Integer.valueOf(scanner.nextLine());
                    orderServise.deleteOrder(id);
                    break;
                case 'p':
                    orderServise.print();
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Unrecognized command: " + str);
            }
        } while (str != 'b');
    }

    private void orderItemController(int orderId) {
        Order order = orderServise.getOrder(orderId);
        TypDiagnostics typDiagmostic;
        TypDiagmosticsRepository typDiagmosticsRepository =new TypDiagmosticsRepository();
        List<TypDiagnostics>typDiagnostics = null;
        RepairWorksRepository repairWorks;
        char str;
        do {
            System.out.println("Order item:add [t]ypDiagnostics,add [r]epairWorks, t[o]talPrice , [p]rint, [b]ack:");
            str = scanner.nextLine().charAt(0);
            switch (str) {
                case 't':
                    System.out.println("Order item: add typDiagnostics:");
                    int numberDiagnostics=scanner.nextInt();
                    typDiagnostics.add(typDiagmosticsRepository.get(numberDiagnostics));
                    orderServise.addOderTypDiagnostics(order,typDiagnostics);

                    break;
                case 'r':
                    System.out.println("Order item: add repairWorks:");
                    int
                    orderServise.addOrderRepairWorks(order, repairWorks.getNumberRepairWorks());
                    break;
                case 'o':
                    double priceTypDiagnostics = typDiagmostic
                    double priceRepairWorks = repairWorks.getPriceRepairWorks();
                    double totalPrice = priceTypDiagnostics + priceRepairWorks;
                    System.out.println("Amount for diagnostics:" + priceTypDiagnostics);
                    System.out.println("Amount for repair work: " + priceRepairWorks);
                    System.out.println("Total amount to be paid: " + totalPrice);
                    System.out.println();
                    break;
                case 'p':
                    System.out.println(order);
                    break;
                case 'b':
                    break;
                default:
                    System.out.println("Unrecognized command: " + str);
            }
        } while (str != 'b');
    }

}

