import java.util.Arrays;
import java.util.HashSet;

public class HasPairWithSum {
    // Using HashSet(one pass)
    public static boolean hasPairWithSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                return true; // pair found
            }

            set.add(num);
        }

        return false;
    }

    public static boolean hasPairwithSumTwoPointerApproach(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true; // pair found
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(hasPairwithSumTwoPointerApproach(arr, target));
    }
}
