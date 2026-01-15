public class VariableNaming {
    /**
     * 
     * Since variables are like containers that store data, how you name the
     * container is important. Most of the time, you will read code more than you
     * write it. It is therefore important to know how to write good code, so thath
     * you give other developers and your future self, an easier time understanding
     * the code.
     * Follow the following rules when naming variables:
     * 1. Variable names cannot begin with a number. Only the following characters
     * are allowed, Unicode letters, $, _. See examples below
     * 2. Variable name cannot be a reserved word, e.g, class, boolean, public
     * 3. Use lower camel case for example int numberOfDays; If the variable name is
     * a single word, use lowercase uncless it is a constant value. Constant values
     * are written in only UPPERCASE.
     * 4. The name should make sense when read, e.g, "durationInSeconds" is better
     * than "durSec"
     */
    public static void main(String[] args) {
        String ß = "eszett";
        int $1 = 1;
        char _123ü = 'ö';
    }
}
