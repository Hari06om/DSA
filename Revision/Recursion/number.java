public class number {
    public static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumbers(i + 1, n);
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        printNumbers(i, n);
    }
}
