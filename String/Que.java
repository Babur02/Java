public class Que {

    public static void main(String[] args) {
        String str = "HeGa";
        sol(str);

    }

    public static void sol(String str) {
        if (str.length() < 3)
            System.out.println(str.toLowerCase());
        else if (str.length() > 2) {
            char arr[] = str.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
            System.out.println(arr);
        }
    }
}
