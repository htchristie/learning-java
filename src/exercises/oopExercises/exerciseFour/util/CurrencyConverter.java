package exercises.oopExercises.exerciseFour.util;

public class CurrencyConverter {

    public static final double taxes = 0.06;

    public static double toReal(double worth, double quantity) {
        return worth * quantity * (1.0 + taxes);
    }
}
