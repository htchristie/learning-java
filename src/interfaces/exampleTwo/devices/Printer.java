package interfaces.exampleTwo.devices;

public class Printer extends Device implements interfaces.exampleTwo.devices.interfaces.Printer {

    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
