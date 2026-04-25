public class hollowtrapizm {
    public static void main(String[] args) {
        int height = 5;
        int topWidth = 6;
        int bottomWidth = 14;

        int totalRows = height;
        int start = (bottomWidth - topWidth) / 2;  // initial left spacing

        for (int i = 0; i < totalRows; i++) {

            int currentWidth = topWidth + 2 * i;
            int leftSpace = start - i;

            // print spaces before trapezium
            for (int s = 0; s < leftSpace; s++) {
                System.out.print("  ");
            }

            // print trapezium
            for (int j = 0; j < currentWidth; j++) {

                if (i == 0 || i == totalRows - 1 || j == 0 || j == currentWidth - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}