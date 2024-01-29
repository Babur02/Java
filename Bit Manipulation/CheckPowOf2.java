public class CheckPowOf2 {
    public static void main(String[] args) {
        int n = 7;
        if ((n & (n - 1)) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
// 4 = 100 & 
// 3 = 011
//     000