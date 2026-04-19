import java.util.Scanner;

public class MaxSubArray {
    public static void kadanes(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int cs = arr[0];
        int ms = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(ms, cs);
        }

        System.out.println("Max Sub Array is: " + ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the Element of the array: ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        kadanes(arr);

    }
}
