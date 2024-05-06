package Controler;

import servise.CarServise;

import java.util.Scanner;

public class CarRegistraitionControler {
    private CarServise servise;
    private Scanner scanner;

    public CarRegistraitionControler(CarServise servise, Scanner scanner) {
        this.servise = servise;
        this.scanner = scanner;
    }
}
