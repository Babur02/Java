import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 100, 60, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // Ascending Order on the basis of ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> 1));

        // Ratio must be in Descending order to get solution (reverse loop)
        int capacity = w;
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // include full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else
            // include fractional item
            {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalValue);
    }
}
