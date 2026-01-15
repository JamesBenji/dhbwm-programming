public class DataTypes {
    // Attribution: HYPERSKILL.ORG Java course

    public static void main(String[] args) {
        /*
            Variable:   A placeholder for holding a value of a particular type. 
            Data type:  A unique keyword that specifies the type of operations that can be performed on a variable and the type of data it can store.
        */

        // Primitive types

        byte    tinyNum = 127;                  // 8-bit     from -128           to 127
        short   smallNum = 32000;               // 16-bit    from -32,768        to 32,767
        int     integer = 1;                    // 32-bit    from -2^31          to (2^31) - 1
        long    longNumber = 1_000_000_000L;    // 64-bit    from -2^63          to (2^63) - 1              The L is important. All long numbers must have it.

        float   decimal = 1.1F;                 // 32-bit    from 1.4 * 10^-45   to approx. 3.4 * 10^38     The F is important. All float numbers must have it.
        double  doubleDecimal = 1.1;            // 64-bit    from 4.9 * 10^-324  to approx. 1.7977 * 10^308

        char    character = 'c';                // 16-bit    from '\u0000'       to '\uffff'
        boolean bool = true;

        // Reference types ie non-primitive types
        String  string = "Hi";                  // This is an object, not a primitive data type
        
        var     autoType = "I am a String";     // Type inference (Java 10+)

    }
}