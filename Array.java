import java.util.*;

public class Array {
    public static void leftRotateByOne(int arr[]) {
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void moveZeros(int arr[]) {
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static int findMissing(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missionNumber = expectedSum - actualSum;
        return missionNumber;
    }

    public static int[] findTwoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, 1 };
    }

    public static int[] mergeArrays(int arr1[], int arr2[], int n1, int n2) {
        int result[] = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements of both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static int findMajorityElement(int arr[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static int findEquilibriumIndex(int arr[]) {
        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now total sum is right sum

            if (totalSum == leftSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;

    }

    public static ArrayList<Integer> findLeaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int rightMax = arr[arr.length - 1];
        leaders.add(rightMax); // Last element is always a leader

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > rightMax) {
                rightMax = arr[i];
                leaders.add(rightMax);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String agrs[]) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };

    }
}
