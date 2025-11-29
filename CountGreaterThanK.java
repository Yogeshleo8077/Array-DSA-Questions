public class CountGreaterThanK {
    public static void countGreater(int arr[], int k) {
        int count = 0;
        for (int num : arr) {
            if (num > k) {
                count++;
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Count of greater elements is: " + count);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 11, 5 }; // predefined array
        int k = 6;

        countGreater(arr, k);
    }
}