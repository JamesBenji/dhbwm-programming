import java.util.Scanner;

/**
 * QUESTION
 * LEVEL: Hard
 * 
 * You are given a number as the input.
 * Your task is to determine whether it is a positive integer, negative integer,
 * zero or a non-integer.
 * If the integer is positive, print 'positive'.
 * If it is negative, print 'negative'. If the integer is zero, print 'zero'. If
 * it is a non-integer, print 'non-integer'.
 */

public class IntegerGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int x = Integer.parseInt(input);

            if (x < 0) {
                System.out.println("negative");
            } else if (x > 0) {
                System.out.println("positive");
            } else {
                System.out.println("zero");
            }
        } catch (Exception e) {
            System.out.println("non-integer");
        }

        scanner.close();

    }
}
