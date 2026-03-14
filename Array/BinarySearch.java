import java.util.Scanner;

public class BinarySearch{
    public static void binary(int[] arr, int k){
        int n = arr.length;
        int s =0 , e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array in sorted order: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int k = sc.nextInt();
        binary(arr, k);
    }
}