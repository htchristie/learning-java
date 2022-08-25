package exercises.interfaceExercises.exerciseOne.model.services;

public interface OnlinePaymentService {

    Double paymentFee(double amount);
    Double interest(double amount, int months);
}
