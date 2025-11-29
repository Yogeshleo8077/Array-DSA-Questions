public class SwapMinMax {
    public static void swapMinMax(int arr[]) {
        int minIndex = 0;
        int maxIndex = 0;

        // find indices of min & max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }

            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // swap min and max
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 2, 7 };
        swapMinMax(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}