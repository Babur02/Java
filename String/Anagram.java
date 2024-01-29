import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "race";
        String b = "care";

        char ca[] = a.toCharArray();
        char cb[] = b.toCharArray();

        Arrays.sort(ca);
        Arrays.sort(cb);

        Boolean result = Arrays.equals(ca, cb);
        if (result == true)
            System.out.println("Anagram");
        else
            System.out.println("Not-Anagram");
    }
}
