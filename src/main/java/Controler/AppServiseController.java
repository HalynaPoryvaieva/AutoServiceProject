package Controler;

import servise.*;

import java.util.Scanner;

public class AppServiseController {

    private final CarServise carServise;
    private final ClientServise clientServise;
    private final OrderServise orderServise;
    private final TypDiagmosticsServise typDiagmosticsServise;
    private final RepairWorksServise repairWorksServise;
    private final Scanner scanner;

    public AppServiseController(final CarServise carServise,
                                final ClientServise clientServise,
                                final OrderServise orderServise,
                                final TypDiagmosticsServise typDiagmosticsServise,
                                final RepairWorksServise repairWorksServise) {
        this.carServise = carServise;
        this.clientServise = clientServise;
        this.orderServise = orderServise;
        this.typDiagmosticsServise = typDiagmosticsServise;
        this.repairWorksServise = repairWorksServise;
        this.scanner=new Scanner(System.in);
    }

    public void run(){
        char str;
        CarRegistraitionControler carRegistraitionControler=new CarRegistraitionControler(carServise,scanner);
    }
}
