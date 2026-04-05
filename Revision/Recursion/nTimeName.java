public class nTimeName {
    public static void printNameNTimes(String name, int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(name); 
        printNameNTimes(name, n - 1); 
    }
    public static void main(String[] args) {
        String name = "John";
        int n = 3;
        printNameNTimes(name, n);
    }
}
