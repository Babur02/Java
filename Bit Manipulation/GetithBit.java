public class GetithBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }

    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0)
            return 0;
        else
            return 1;
    }
}
// 10 = 1010
// 2nd bit = 0