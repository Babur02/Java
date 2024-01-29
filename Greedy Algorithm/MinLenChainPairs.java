import java.util.Arrays;
import java.util.Comparator;

public class MinLenChainPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Sort on the basis of end
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // Pick First Pair
        int chainLen = 1;
        int chainEnd = pairs[0][1]; // Last Selected Pair end

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
// wrong output