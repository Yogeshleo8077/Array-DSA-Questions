public class CopyArray{
    public static int[] copyElements(int arr[]){
        int newArr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = copyElements(arr);

        System.out.print("Copied Array: ");
        for(int num : arr2){
            System.out.print(num + " ");
        }
    }
}