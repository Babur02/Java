import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int a[] = { 4, 5, 1 };
        int b[] = { 3, 4, 5 };
        ArrayList<Integer> ans = new ArrayList<>();
        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int val1 = a[i];
            int val2 = b[j];
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }
        // First case when length of a is more
        while (i >= 0) {
            int sum = a[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }
        // Second case when length of b is more
        while (j >= 0) {
            int sum = b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }
        // Third case when length of both is equal
        while (carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
