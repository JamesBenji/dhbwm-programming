public class ProgrammingLogicOperations {

    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        System.out.println("Input A: " + A);
        System.out.println("Input B: " + B);
        System.out.println();

        System.out.println("AND Gate (A && B):      " + (A && B));

        System.out.println("OR Gate (A || B):       " + (A || B));

        System.out.println("NOT Gate (!A):          " + (!A));

        System.out.println("XOR Gate (A ^ B):       " + (A ^ B));

        System.out.println("NAND Gate !(A && B):    " + !(A && B));
    }
}