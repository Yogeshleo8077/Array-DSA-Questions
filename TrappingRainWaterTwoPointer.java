public class TrappingRainWaterTwoPointer {
    public static int trap(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                // Work on left side
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater = totalWater + leftMax - height[left];
                }
                left++;
            } else {
                // Work on right side
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater = totalWater + rightMax - height[right];
                }

                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Trapped water: " + trap(height));
    }
}