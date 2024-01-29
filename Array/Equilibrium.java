public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 2 };
        System.out.println(equilibrium(arr));
    }

    public static int equilibrium(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int prefixSum = arr[0];
        int i = 1;
        while (i < arr.length - 1) {
            int rightSum = totalSum - prefixSum - arr[i];
            if (rightSum == prefixSum)
                return i + 1;
            else {
                prefixSum += arr[i];
                i++;
            }
        }
        return -1;
    }
}
