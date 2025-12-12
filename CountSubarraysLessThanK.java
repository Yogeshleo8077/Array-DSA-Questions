public class CountSubarraysLessThanK {
    public static int countSubarraysLessThanK(int arr[], int k) {
        int count = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (left <= right && sum >= k) {
                sum -= arr[left];
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 5;

        System.out.println(countSubarraysLessThanK(arr, k));
    }
}