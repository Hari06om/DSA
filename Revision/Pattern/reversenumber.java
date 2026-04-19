
import java.util.Scanner;


public class reversenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number u want to reverse : ");
        int a = sc.nextInt();
        System.out.println("Enter the number u want to till  the revese working : ");
        int b = sc.nextInt();
        for(int i = a ;i>=b;i--){
            System.out.println(i);
        }
    }
}
