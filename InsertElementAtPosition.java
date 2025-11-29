public class InsertElementAtPosition {
    public static int[] insertAtPosition(int arr[], int position, int element) {

        if (position <= 0 || position > arr.length) {
            System.out.println("Invalid Position.");
            return arr;
        }

        int newArr[] = new int[arr.length + 1];
        int index = position - 1; // Convert 0-based indexing

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element; // Insert element
            } else {
                newArr[i] = arr[j]; // Copy old elements
                j++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int position = 3;
        int element = 99;

        int result[] = insertAtPosition(arr, position, element);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}