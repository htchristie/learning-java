package interfaces.exampleTwo.devices;

public class Scanner extends Device implements interfaces.exampleTwo.devices.interfaces.Scanner {

    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
