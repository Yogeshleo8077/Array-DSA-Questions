public class DeleteElementAtPosition {
    public static int[] deleteAtPosition(int arr[], int position) {

        if (position <= 0 || position > arr.length) {
            System.out.println("Invalid Position.");
            return arr;
        }

        int newArr[] = new int[arr.length - 1];
        int index = position - 1; // convert 0-based indexing

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue; // skip the element to delete
            }

            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int position = 3;
        int result[] = deleteAtPosition(arr, position);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}