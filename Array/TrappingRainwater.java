public class TrappingRainwater {
    // Conditions to Trap = Min no of bars > 2, No water is trapped in asc/desc
    // order of height
    // TrappedWater = (WaterLevel-Barlevel|Height) * Width
    // WaterLevel = min(leftMaxBoundary, rightMaxBoundary)
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }

    public static int trappedRainwater(int height[]) {

        // Calculate leftMaxBoundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate rightMaxBoundary
        int n = height.length;
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // WaterLevel = min(leftMaxBoundary, rightMaxBoundary)
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // TrappedWater = (WaterLevel-Barlevel|Height) * Width
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
