import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int A[] = { 1, 2, 2, 2, 3, 4 };
        int B[] = { 1, 2, 2, 3, 3 };
        int n = A.length;
        int m = B.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A[i] == B[j]) {
                ans.add(A[i]);
                i++;
                j++;
            }
            if (A[i] < B[j])
                i++;
            else
                j++;
        }
        System.out.println(ans);
    }
}
