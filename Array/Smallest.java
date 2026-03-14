import java.util.Scanner;

public class Smallest{
    public static int smallest(int[] arr){
        int smll = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
        if(arr[i]<smll){
            smll = arr[i];
             }
        }
        return smll;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the arrays: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();  
        }
        System.out.println("The smallest element in the array is: " + smallest(arr));
    }
}