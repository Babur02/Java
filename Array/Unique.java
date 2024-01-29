public class Unique {
    public static void main(String[] args) {
        int arr[] = { 29, 5, 6, 45, 45, 29, 6 };
        unique(arr);
        // unique2(arr);
    }

    public static void unique(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // Same element xor gives 0 and 0 xor 5 = 5
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
    // public static void unique2(int arr[])
    // {
    // for (int i = 0; i < arr.length; i++)
    // {
    // for (int j = 0; j < arr.length; j++)
    // {
    // if(i!=j && arr[i]==arr[j])

    // }
    // }
    // System.out.println(arr[i]);
    // }
}
