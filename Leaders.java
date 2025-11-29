import java.util.ArrayList;
import java.util.Collections;


public class Leaders{
    public static ArrayList<Integer> findLeaders(int arr[]){
        ArrayList<Integer> leaders = new ArrayList<>();
        int rightMax = arr[arr.length-1];
        leaders.add(rightMax); // Last element is always a leader

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > rightMax){
                rightMax = arr[i];
                leaders.add(rightMax);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaders(arr));
    }
}