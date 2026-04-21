
import java.util.Scanner;

public class reverse {
    public static void reverseNumber(int a) {
            int rev =0;
            while(a>0){
                int rem = a%10;
                rev = rev*10+rem;
                a =a/10;
            }
            System.out.println("Reversed number: " + rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int a = sc.nextInt();
        reverseNumber(a);
    }
}
