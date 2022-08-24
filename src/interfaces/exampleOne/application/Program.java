package interfaces.exampleOne.application;

import interfaces.exampleOne.model.entities.CarRental;
import interfaces.exampleOne.model.entities.Vehicle;
import interfaces.exampleOne.model.services.BrazilTaxService;
import interfaces.exampleOne.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String carModel = scan.nextLine();
        System.out.print("Pick-up date (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(scan.nextLine());
        System.out.print("Return date (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(scan.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Price per hour: ");
        double pricePerHour = scan.nextDouble();
        System.out.print("Price per day: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        scan.close();
    }
}
