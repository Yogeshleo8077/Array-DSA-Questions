import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {
    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }

        }

        return minHeap.peek();
    }

    public static void main(String agrs[]) {
        int arr[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(kthLargest(arr, k));
    }
}