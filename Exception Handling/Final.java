// Final -> Keyword, Uses - var,method,classes | variable value cant change, method override not possible, class cant be extends
// Finally -> Block, Uses - with try catch to close the object | 
// Finalize -> method, Uses - for cleaning the code

public class Final {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(5 / 0);
        } finally {
            System.out.println("Finally"); // No matter exception occurs or not finally block will run
        }

    }
}
