import java.util.Scanner;

public class MaxSubArray {
         public static void kadanes(int arr[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for(int i =0;i<arr.length;i++){
                cs = cs + arr[i];
                if(cs <0){
                    cs =0;
                }
                ms = Math.max(cs,ms);
            }
            System.out.println("Max Sub Array is: "+ms);
         }
        public static void main(String[] args){
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
