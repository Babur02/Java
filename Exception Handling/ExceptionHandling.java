// It is approach to maintain flow of programme
// it is not repair the exception or error,it just redefine another way to handle exception

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(5 / 0);

        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }

        int[] array = { 1, 2 };
        // (Runtime) Unchecked Exception
        try {
            System.out.println(array[2]);
        } catch (IndexOutOfBoundsException iBoundsException) {
            System.out.println(iBoundsException);
        }

    }
}
