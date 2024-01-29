public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello!";
        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end pointers
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        String reversed = new String(charArray);
        System.out.println(reversed);
        System.out.println("Hello!");
    }
}
