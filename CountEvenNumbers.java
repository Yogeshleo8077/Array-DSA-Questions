public class CountEvenNumbers {
    public static int[] buildEvenPrefix(int arr[]) {
        int evenPrefix[] = new int[arr.length];

        if (arr[0] % 2 == 0) {
            evenPrefix[0] = 1;
        } else {
            evenPrefix[0] = 0;
        }

        for (int i = 1; i < arr.length; i++) {
            evenPrefix[i] = evenPrefix[i - 1] + (arr[i] % 2 == 0 ? 1 : 0);
        }

        return evenPrefix;
    }

    public static int evenCount(int evenPrefix[], int L, int R) {
        if (L == 0) {
            return evenPrefix[R];
        }

        return evenPrefix[R] - evenPrefix[L - 1];
    }

    public static void main(String args[]) {
        int[] arr = { 3, 2, 7, 4, 6, 5 };

        int evenPrefix[] = buildEvenPrefix(arr);

        int L = 1, R = 4;

        int result = evenCount(evenPrefix, L, R);
        System.out.println(result);
    }
}