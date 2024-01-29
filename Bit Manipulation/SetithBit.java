public class SetithBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }

    public static int setIthBit(int n, int i) {
        return (n | (1 << i));
         
    }
}
// 10 = 1010
// 2nd bit = 0