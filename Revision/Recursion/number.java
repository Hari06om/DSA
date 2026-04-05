public class number {
    public static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumbers(i + 1, n);
    }
    public static void printNumbersReverse(int i , int n){
        if(i>n){
            return;
        }

        System.out.println(n);
        printNumbersReverse(i, n-1);
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        printNumbers(i, n);
        System.err.println("Reverse: ");
        printNumbersReverse(i, n);
    }
}
