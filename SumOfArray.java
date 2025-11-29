public class SumOfArray{
    public static int sumArray(int arr[]){
        int arraySum = 0;
        for(int num : arr){
            arraySum += num;
        }

        return arraySum;
    }
public static void main(String[] args) {
    int[] arr = {5, 10, 15, 20};
    System.out.println(sumArray(arr));
}    
}