import java.util.HashMap;

public class SubarraySumIndices {
    public static int[] subarraySumIndices(int arr[], int target) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        map.put(0L, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            long need = sum - target;

            if (map.containsKey(need)) {
                int start = map.get(need) + 1;
                int end = i;
                return new int[] { start, end };
            }

            map.putIfAbsent(sum, i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int target = 6;

        int result[] = subarraySumIndices(arr, target);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}