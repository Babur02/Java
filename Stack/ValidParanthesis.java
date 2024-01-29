import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(validP(str));
    }

    public static boolean validP(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (c == '(')
                st.push(')');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }

}
