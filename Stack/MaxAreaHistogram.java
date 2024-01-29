import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int nums[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(nums);
    }

    public static void maxArea(int nums[]) {
        // Next Smaller Right
        int nsr[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if (s.isEmpty())
                nsr[i] = nums.length;
            else
                nsr[i] = s.peek();

            s.push(i);
        }
        // Next Smaller Left
        int nsl[] = new int[nums.length];
        s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            if (s.isEmpty())
                nsl[i] = -1;
            else
                nsl[i] = s.peek();
            s.push(i);
        }
        // Curr Area : Width = j-i-1 = nsr[i]-nsl[i]-1
        int maxArea = 0;
        for (int i = 0; i < nums.length; i++) {
            int height = nums[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println(maxArea);
    }
}
