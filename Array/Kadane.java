public class Kadane {
    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadanes(num);
    }

    public static void Kadanes(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs += num[i];
            if (cs < 0)
                cs = 0;
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum : " + ms);
    }
}
