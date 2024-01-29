import java.util.Stack;

// Nxt Greater Right
public class NxtGreaterElement {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 0, 1, 3 };
        int nxtGreaterElement[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGreaterElement[i] = -1;
            } else
                nxtGreaterElement[i] = nums[s.peek()];

            s.push(i);
        }
        for (int i = 0; i < nxtGreaterElement.length; i++) {
            System.out.print(nxtGreaterElement[i] + " ");
        }
    }
}
// Nxt Greater Left = for loop 0 to n;
// Nxt Smaller Right = while loop >= ;
// Nxt Smaller Left = for loop 0 to n , while loop >= ;