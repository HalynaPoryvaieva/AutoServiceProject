import Controler.AppServiseController;
import repository.*;
import servise.*;

public class AppAutoServise {
    public static void main(String[] args) {
        CarRepository carRepository=new CarRepository();
        ClientRepository clientRepository=new ClientRepository();
        OrderRepository orderRepository=new OrderRepository();
        TypDiagmosticsRepository typDiagmosticsRepository=new TypDiagmosticsRepository();
        RepairWorksRepository repairWorksRepository=new RepairWorksRepository();

        CarServise carServise=new CarServise(carRepository);
        ClientServise clientServise=new ClientServise(clientRepository);
        OrderServise orderServise=new OrderServise(orderRepository);
        TypDiagmosticsServise typDiagmosticsServise=new TypDiagmosticsServise(typDiagmosticsRepository);
        RepairWorksServise repairWorksServise=new RepairWorksServise(repairWorksRepository);

        carRepository.init();
        clientRepository.init();
        typDiagmosticsRepository.init();
        repairWorksRepository.init();

        new AppServiseController(carServise,clientServise,orderServise,typDiagmosticsServise,repairWorksServise).run();
    }
}
