import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static int findFirstNonRepeating(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Build frequencymap
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Traverse againt to find first with frequency 1
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // if no non-repeating element exists
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 1, 2, 5, 1, 3 };

        int result = findFirstNonRepeating(arr);
        if (result != -1) {
            System.out.println("First non-repeating element: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}