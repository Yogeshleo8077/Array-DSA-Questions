public class SubarraySumNonNegative {
    public static boolean subarraySumNonNegative(int arr[], int target) {
        int left = 0;
        long sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            if (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int target = 6;
        System.out.println(subarraySumNonNegative(arr, target));
    }
}