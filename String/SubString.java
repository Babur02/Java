public class SubString {
    public static void main(String[] args) {
        String str = "Jeans";
        // System.out.println(subString(str, 0, 04));
        System.out.println(str.substring(0, 4)); // Function
    }

    public static String subString(String str, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
}
