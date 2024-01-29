public class ClearithBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }

    public static int clearIthBit(int n, int i) {
        return (n & ~(1 << i));
    }
}
// 10 = 1010
// 2nd bit = 0
