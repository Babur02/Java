import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new Date());
        SimpleDateFormat ft = new SimpleDateFormat("dd-mm-yy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date " + str);

        String s = "Ab";
        System.out.println(s.toUpperCase());

        char c = 'a';
        System.out.print(c);
        System.out.println(" " + (char) (c - 32));

        System.out.print(10 << 0); // No(10)*2 power shift(0)
        System.out.print(" ");
        System.out.print(10 << 1);
        System.out.print(" ");
        System.out.println(10 << 2);
        System.out.print(10 >> 0); // No(10)/2 power shift(0)
        System.out.print(" ");
        System.out.print(10 >> 1);
        System.out.print(" ");
        System.out.println(10 >> 2);

        float f = 1.4f;
        System.out.println(f);

        System.out.println("Enter");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println((char) (a + 4));
        System.out.println((char) (b + 4));

    }

}
