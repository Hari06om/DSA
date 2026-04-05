public class nTimeName {
    public static void printNameNTimes(String name, int n) {
        if (n <= 0) {
            return; // Base case: stop when n is 0 or negative
        }
        System.out.println(name); // Print the name
        printNameNTimes(name, n - 1); // Recursive call with n decremented by 1
    }
    public static void main(String[] args) {
        String name = "John";
        int n = 3;
        printNameNTimes(name, n);
    }
}
