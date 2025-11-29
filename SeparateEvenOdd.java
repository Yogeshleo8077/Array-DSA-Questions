public class SeparateEvenOdd {
    public static void separateEvenOdd(int arr[]) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create separate arrays based on counts
        int evenArr[] = new int[evenCount];
        int oddArr[] = new int[oddCount];

        int eIndex = 0;
        int oIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[eIndex++] = num;
            } else {
                oddArr[oIndex++] = num;
            }
        }

        // Print even array
        System.out.print("Even Array: ");
        for (int num : evenArr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Print odd array
        System.out.print("Odd Array: ");
        for (int num : oddArr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        separateEvenOdd(arr);
    }
}