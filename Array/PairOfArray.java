import java.util.*;
public class PairOfArray {

    public static void pair(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }

            System.out.println();
        }
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
        pair(arr);

        
    }
}
