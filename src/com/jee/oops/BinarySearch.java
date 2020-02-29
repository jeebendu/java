package src.com.jee.oops;

public class BinarySearch{

    public static void main (String arg[]){
        System.out.println ("Binary Search Programming.");

        int arr[] = {10,20,30,40,50};
        int key = 50;
        int first=0;
        int last=arr.length-1;
        int result = binarySearch(arr, first, last, key);
        System.out.println(result);
    }

    public static int binarySearch(int arr[], int first, int last, int key) {
        int mid = first + (last - first)/2;  
        if(arr[mid]==key){
            return 1;
        }else if(key < arr[mid]){
            return binarySearch(arr,first,mid-1,key);
        }else{
            return binarySearch(arr,mid+1,last,key);
        }
        
    }
}