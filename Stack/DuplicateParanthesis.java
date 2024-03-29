import java.util.Stack;

public class DuplicateParanthesis {
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        String str2 = "((a+b))";
        System.out.println(duplicate(str));
    }

    public static boolean duplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1)
                    return true;

            } else
                s.push(ch);
        }
        return false;
    }
}
