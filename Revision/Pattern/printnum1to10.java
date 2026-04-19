
import java.util.Scanner;

public class printnum1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number form u want to print : ");
        int a = sc.nextInt();
        System.out.print("Enter the number till u want to print : ");
        int b = sc.nextInt();
        for(int i =a;i<=b;i++){
            System.out.println(i);
        }

    }
}
