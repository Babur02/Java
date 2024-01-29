import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder reverse = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            reverse.append(curr);
        }
        return reverse.toString();
    }
}
