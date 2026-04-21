
import java.util.Scanner;

public class printTheLargestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first Number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second Number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third Number: ");
            int c = sc.nextInt();
            if(a>b && a>c){
                System.out.print("The largest number is: "+a);
            }
            else if(b>a && b>c){
                System.out.print("The largest number is: "+b);
            }
            else{
                System.out.print("The largest number is: "+c);
            }
    }
}
