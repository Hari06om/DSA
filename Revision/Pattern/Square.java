
<<<<<<< HEAD
// import java.util.Scanner;

// public class Square {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number to find the square: ");
//         int a = sc.nextInt();
//         for(int i =0;i<a;i++){
//             for(int j=0;j<a;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// do this using function and also add the option to print hollow square pattern.
=======
>>>>>>> Revision
import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the square: ");
        int a = sc.nextInt();
<<<<<<< HEAD
        printSquare(a);
    }

    public static void printSquare(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
=======
        for(int i =0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print("* ");
>>>>>>> Revision
            }
            System.out.println();
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> Revision
