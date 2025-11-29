import java.util.HashSet;

public class FirstRepeatingElement {
    public static int findFirstRepeating(int arr[]) {

        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num; // first repeating element
            }

            seen.add(num);
        }

        return -1; // if no repeating element found
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 1, 2, 5, 1, 3 };
        int result = findFirstRepeating(arr);
        if (result != -1) {
            System.out.println("First repeating element: " + result);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}