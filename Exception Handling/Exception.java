// Exception is unwanted or unexpected event, which occurs during the execution of a programme(run time),that disturbs the normal flow of programme
// Exception can be handle | Error cant
// Object is parent class of in java
// Checked exception can be checked by compiler | Unchecked exception cant

public class Exception {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(5 / 0);

        // Checked Exception
        // Class.forName("com.sql.jdbc");
        int[] array = { 1, 2 };

        // (Runtime) Unchecked Exception
        System.out.println(array[2]);
    }
}
