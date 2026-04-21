import java.util.Scanner;
public class evennumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from u want to start the  even numbers to print: ");
        int a  = sc.nextInt();
        System.out.print("Enter the number from u  want to end the  even numbers to print: ");
        int b  = sc.nextInt();
        for(int i =a;i<=b;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}


