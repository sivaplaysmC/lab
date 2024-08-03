// Write a Java program to print the results of the following operations.
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3
// Expected Output :
// 43
// 1
// 19
// 13

public class OperationResult {
  public static void main(String[] args) {
    System.out.printf("%d\n", -5 + 8 * 6);
    System.out.printf("%d\n", (int) ((55 + 9) % 9));
    System.out.printf("%d\n", (int) (20 + -3 * 5 / 8));
    System.out.printf("%d\n", (int) (5 + 15 / 3 * 2 - 8 % 3));
  }
}
