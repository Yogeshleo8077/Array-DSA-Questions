public class CountPairs {
    public static int countPairs(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            if (arr[left] + arr[right] < k) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 8, 9 };
        int k = 10;
        System.out.println(countPairs(arr, k));
    }
}