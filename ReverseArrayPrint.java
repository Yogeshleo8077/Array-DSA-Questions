public class ReverseArrayPrint{
    public static void printReverse(int arr[]){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        printReverse(arr);
        
    }
}