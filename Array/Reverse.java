import java.util.Scanner;
public class Reverse {
    public static void reverse(int[] arr){
        int f =0 , l =arr.length-1;
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l]= temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.print("Reversed array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }

    }

}

