import java.util.Scanner;

public class reversehalfpyrmid {

    public static void pyramid(int n){
        for(int i=0;i<n;i++){ // for each row
            for(int j =0;j<n-i-1;j++){ // for spaces
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){ // for stars
                System.out.print("* "); 
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        pyramid(n);
    }
}
