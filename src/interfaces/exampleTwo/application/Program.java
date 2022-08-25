package interfaces.exampleTwo.application;

import interfaces.exampleTwo.devices.ComboDevice;
import interfaces.exampleTwo.devices.Printer;
import interfaces.exampleTwo.devices.Scanner;

public class Program {
    public static void main(String[] args) {

        Printer printer = new Printer("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        System.out.println();

        Scanner scanner = new Scanner("2003");
        scanner.processDoc("My Email");
        System.out.println("Scan result: " + scanner.scan());

        System.out.println();

        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result: " + comboDevice.scan());
    }
}
