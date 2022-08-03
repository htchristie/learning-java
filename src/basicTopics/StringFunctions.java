package basicTopics;

public class StringFunctions {
    public static void main(String[] args) {

        //Formatting: toLowerCase(), toUpperCase(), trim()
        //Cut: substring(start), substring(start, end)
        //Replace: replace(char, char), replace(string, string)
        //Search: indexOf, lastIndexOf
        //str.Split(" ")

        String myString = "    abcde FGHIJ ABC abc DEFG";

        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.trim());

        System.out.println(myString.substring(4));
        System.out.println(myString.substring(4, 9));

        System.out.println(myString.replace('a', 'p'));
        System.out.println(myString.replace("abc", "xyz"));

        System.out.println(myString.indexOf("FG"));
        System.out.println(myString.lastIndexOf("FG"));

        String[] myVector = myString.trim().split(" ");

        for (int i = 0; i < myVector.length; i++) {
            System.out.println(myVector[i]);
        }
    }
}
