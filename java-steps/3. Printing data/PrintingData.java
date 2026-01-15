public class PrintingData {
    // Attribution: HYPERSKILL.ORG Java course

    public static void main(String[] args){
        /*
            Standard output is a receiver to which a program can send information as text. Java provides access to the standard output via the "System.out" object. 
            The "System.out" has multiple methods, however we will consider the following:
            - println(): Prints data as a string followed by a new line. An empty println() just prints an empty line.
            - print(): Prints data as a string (does not add a new line)
            - printf(): Prints a formatted string where special placeholder characters must be used eg %d. This was most likely carried over from C.
         */

        // Extra: Shortcut for System.out.println() on VS Code and IntelliJ: sout + Enter

        // print() in action
        System.out.print("print(): No ");
        System.out.print("new line");
        
        // println() in action
        System.out.println(); // empty line
        System.out.println();
        System.out.println("println(): This is line 1");
        System.out.println("println(): This is line 2");
        System.out.print("Even print started on a new line");
        
        // printf() in action
        System.out.println();
        System.out.println();
        System.out.printf("This a number: %d", 5);
        System.out.println();
        System.out.println();
        System.out.printf("This a string: %s", "Hello");
        
        // Concatenating data: Putting the pieces together within the print
        System.out.println();
        System.out.println();
        System.out.println("Concatenation");
        System.out.println("Con" + "catenated t" + 3 + "xt l" + 0 + "oks like " + "Math.");

        // Escape sequences: We use a backslash to print special characters such as, new lines, tab, apostrophes, 
        System.out.println("Someone said, \"Java is boring\". \nI disagree\t :)");

        // Fun example:
        System.out.print("What\'s");
        System.out.print(" ");
        System.out.println("new");

    }
}