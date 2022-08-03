package basicTopics;

public class BitwiseOperator {
    public static void main (String[] args) {
        // & -> 'and' bit to bit
        // | -> 'or' bit to bit
        // ^ -> 'or exclusive' bit to bit

        int X = 89; //0101 1001
        int Y = 60; //0011 1100

        System.out.println(X & Y); // 0001 1000 (24)
        System.out.println(X | Y); // 0111 1101 (125)
        System.out.println(X ^ Y); // 0110 0101 (101)
    }
}
