import java.util.*;

public class Largest{
    public static int largest(int[] arr){
        int lar = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element in the array is: " + largest(arr));
    }
}