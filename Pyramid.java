public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces for left alignment
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print asterisks for the pyramid
            }
            System.out.println(); // Move to the next line
        }
    }
}
