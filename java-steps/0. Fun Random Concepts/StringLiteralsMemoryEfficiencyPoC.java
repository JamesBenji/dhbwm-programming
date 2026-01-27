public class StringLiteralsMemoryEfficiencyPoC {
    public static void main(String[] args) {
        System.out.println("We will use the same literal value to illustrate the different workings of the two ways of creating string literals.");
        System.out.print("String string1 = ... will share the memory of the literal with the other variable attempting to create it. ");
        System.out.println("The comparison results in true because the variable point to exactly the same memory location despite the values being the same. The same test fails with new String()");
        
        System.out.println("----------------------------------------------------------------------");

        String string1 = "java";
        String string2 = "java";
        String string3 = "java programming";
        System.out.println("[TEST 1] string1 == string2: " + String.valueOf(string1 == string2) );

        System.out.println("----------------------------------------------------------------------");
        
        System.out.println("[TEST 2] String3 is not equal to the former two literals: string3 == string2: " + String.valueOf(string3 == string2));
        System.out.println("new String() will create a new memory location for each literal even if they are exactly the same. The comparison results in false.");

        System.out.println("----------------------------------------------------------------------");
        
        String string4 = new String("java");
        String string5 = new String("java");
        System.out.println("[TEST 3] string5 == string4: " + String.valueOf(string5 == string4));

        //Easter Egg: To compare the actual values in the reference String, we must use the .equals method.
        // The comparison operators compare memory locations for reference objects. For primitive variables, the comparison operators compare the actual values

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Comparing the values of string4 and string5");
        System.out.println("[Easter Egg] Do string4 and string5 have the same values? " + String.valueOf(string4.equals(string5)));
    }
}
