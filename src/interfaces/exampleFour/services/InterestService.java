package interfaces.exampleFour.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("You can't get a loan for less than a month.");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
