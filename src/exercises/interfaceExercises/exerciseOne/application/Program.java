package exercises.interfaceExercises.exerciseOne.application;

import exercises.interfaceExercises.exerciseOne.model.entities.Contract;
import exercises.interfaceExercises.exerciseOne.model.entities.Installment;
import exercises.interfaceExercises.exerciseOne.model.services.ContractService;
import exercises.interfaceExercises.exerciseOne.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Contract number: ");
        Integer number = scan.nextInt();
        System.out.print("Date: ");
        Date date = sdf.parse(scan.next());
        System.out.print("Contract value: ");
        Double value = scan.nextDouble();
        System.out.print("Number of installments: ");
        int installments = scan.nextInt();

        Contract contract = new Contract(number, date, value);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        System.out.println("Installments: ");
        for (Installment ins : contract.getInstallments()) {
            System.out.println(ins);
        }
    }
}
