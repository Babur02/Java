public class Kadane2 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        kadanes(arr);
    }

    public static void kadanes(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs += num[i];
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
}
