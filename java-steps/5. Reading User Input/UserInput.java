import java.util.Scanner;

public class UserInput {
    // Attribution: HYPERSKILL.ORG Java course

    /**
     * For a Java program to read user data, it needs to work with the Operating
     * System (which is in control of the hardware)
     * Java allows for this by using the "System.in" object which uses the
     * **standard input**.
     * 
     * The Standard Input is a data stream that originates from input devices of
     * files (accessed via the operating system) into the Java program.
     * The default standard input device is the keyboard. The standard input (data
     * pipe) is represented by the "System.in" object in Java.
     * 
     * In order to read the data from the standard input "data pipe", Java uses the
     * Scanner class (it literally like a fisherman, looking through the
     * "water/Standard input" for "fish/data"). Let's "fish" for data.
     * 
     * STEP 1: Import the Scanner class. This can only be done above the "public
     * class" declaration on lines 1 and 3.
     * In Java, the word import is used to bring external classes and packages into
     * our program. This allows us to reuse the code.
     * STEP 2: Create a scanner object. This is because Scanner is a class and it
     * only allows us to use its objects. This is an object-oriented programming
     * concept that we will look into later.
     * STEP 3: Know which method to use to read which data, and then use it.
     * 
     * Note: We can scan for text as many times as we want using the same scanner
     * object before closing it.
     * 
     * With Java 18+, Scanner uses UTF-8 as the default character encoding. Special
     * characters such as è, ü, ä, ö, will alway be correctly interpreted.
     * 
     */

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in); // The Scanner class requires a data source to monitor. The data
                                                        // source we want to connect with is the Standard Input
                                                        // represented as "System.in"

        // 1. READING STRING DATA
        System.out.println("1.1 Enter a line of text");
        String name = scannerObject.next();
        /**
         * NOTE 1.1:
         * :> By default, the next() method returns the data as a string; you have to
         * save the data in a string variable <:
         * If you save the data with another data type, you will get a compilation error
         * of this sort:
         * 
         * UserInput.java:29: error: incompatible types: String cannot be converted to
         * int
         * int name = scannerObject.next();
         * ^
         * 1 error
         * error: compilation failed
         */

        // To see the printed input, you must press Enter to tell Java that you have
        // finished your input
        System.out.println(name); // Try entering your first name, and then entering a sentence. Do you see the
                                  // problem with using next()?

        /**
         * NOTE 1.2:
         * The issue with next(); It's not a bug, it's a feature
         * 
         * The next() returns to the variable only the text from the beginning of the
         * user input up to the first whitespace.
         * If a user enters, "Hello there", only "Hello" is printed out. If the user
         * starts with whitespaces, they are ignored; eg, " Hi there ", only "Hi" is
         * returned.
         * 
         * We can use the nextLine() to accept a full line of text as the user enters
         * it. Yes, you still need to press Enter after your input; the data needs to be
         * saved in a String variable.
         */

        System.out.println("1.2 Enter a line of text");
        String userLine = scannerObject.nextLine(); // :? What will this line look like? " Nothing ______ "
        System.out.println(userLine);

        // 2. READING INTEGER DATA
        System.out.println("2. Enter an integer");
        int integer = scannerObject.nextInt();
        System.out.println(integer);

        /**
         * EASTER 🥚: The Scanner uses the decimal notation of the operating system. If
         * your operating system has Germany's decimal representation, then you can use
         * commas and full stops as used in the currency, ie Locale settings. Eg 10/3 =
         * 3,3333333 in Germany, but the international representation would be 3.33333
         * 🐣
         */

        // 3. READING DOUBLE DATA
        System.out.println("3. Enter a double number");
        double doubleNumber = scannerObject.nextDouble();
        System.out.println(doubleNumber);

        // 4. READING FLOAT DATA
        System.out.println("4. Enter a float number");
        float floatNumber = scannerObject.nextFloat();
        System.out.println(floatNumber);

        // 5. READING BOOLEAN DATA
        System.out.println("5. Enter a boolean");
        boolean booleanValue = scannerObject.nextBoolean();
        System.out.println(booleanValue);

        // 6. READING OTHER DATA
        // A The pattern is scannerObject.next + Java-Data-Type (); eg short, long =>
        // nextShort(), nextLong()

        scannerObject.close(); // This tells Java that we are done with using this object; it is similar to
                               // closing a book after reading it. The Garbage collector can step in (another
                               // concept we will look at)

    }
}
