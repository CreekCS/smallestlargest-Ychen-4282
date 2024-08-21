//Eiling Chen
public class SmallestLargest{
    public static void main(String[] args){
        int arr[] = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 99)+1;
        }
        System.out.println(smallestValue(arr));
        System.out.println(largestValue(arr));
    }
    public static int smallestValue(int arr[]){
        int a = 1000;
        for(int i = 0; i<arr.length; i++){
            if(a>arr[i]){
                a = arr[i];
            }
        }
        return a;
    }
    public static int largestValue(int arr[]){
        int b = -1;
        for(int i = 0; i<arr.length; i++){
            if(b<arr[i]){
                b = arr[i];
            }
        }
        return b;
    }
}