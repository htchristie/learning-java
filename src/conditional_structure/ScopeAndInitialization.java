package conditional_structure;

import java.util.Locale;

public class ScopeAndInitialization {
    public static void main (String [] args) {

        // this file contains errors on purpose

        // scope: where the variable is valid, as in: where it can be referenced
        // variables cannot be used unless they've been initialized

        //Locale.setDefault(Locale.US);

        //double price;
        //System.out.println(price); // error: variable 'price' might not have been initialized

        //if (price < 200.00) {
            //double discount = price * 0.1;
        //}

        //System.out.println(discount); // error: bring 'double discount' into scope
    }
}
