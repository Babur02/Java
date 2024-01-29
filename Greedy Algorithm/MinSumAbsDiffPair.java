import java.util.Arrays;

public class MinSumAbsDiffPair {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        // Abs values are always +ve
        // A and B are as close as results in min diff
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println(minDiff);
    }
}
