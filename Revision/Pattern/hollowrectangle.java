
import java.util.Scanner;

public class hollowrectangle{

    public static void holrect(int n , int m ){
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                int res = (i ==0 || i == n-1 || j==0||j==m-1) ? 1:0;
                if(res == 1){
                    System.out.print("* ");    
                } 
                else{
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of the Columns : ");
        int m = sc.nextInt();
        holrect(n,m);
    }
}