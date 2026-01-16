public class ArithmeticOperators {

    public static void main(String[] args) {
        // Addition
        System.out.println(10 + 10); // returns 20
        // Subtraction
        System.out.println(20 - 10); // returns 10
        // Multiplication
        System.out.println(20 * 10); // returns 200
        // Division
        System.out.println(20 / 10); // returns 2
        // Remainder
        System.out.println(20 % 10); // returns 0

        // You can use parentheses to group arithmetic operations

        System.out.println(1 + (2 * 2) / 2); // What would this print?

        System.out.println((1 + (2 * 2)) / 2); // What would this print? Different from what you thought?
        System.out.println(((float) (1 + (2 * 2)) / (float) 2)); // How about this?

        // EASTER 🥚: Integer division always provides an integer. The decimal part is
        // truncated. 🐣

        // To get a decimal number from division at least the numerator or denominator
        // must be an decimal / float / double
        System.out.println(10 / 2.0);
        System.out.println(10.0 / 2);

        // Shorthand notation of arithmetic operations is also available in Java
        int number_1 = 10;
        int number_2 = 20;

        number_1 += number_1; // increasing the value of number_1 by 10, making it 20
        System.out.println("Number 1 is after increasing by 10 (expect 20): " + number_1);

        number_1 /= number_2; 
        System.out.println("Number 1 is after dividing by number 2 and assigning it the result of the division (expect 1): " + number_1);

        // The same pattern applies for other operations: /=, %=, -=, *=

    }
}
