import java.util.*;

public class FrequencyOfElements{
    public static void findFrequency(int arr[]){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(int key : freqMap.keySet()){
            System.out.println(key + " appears " + freqMap.get(key) + " times ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 2};
        findFrequency(arr); 
    }
}