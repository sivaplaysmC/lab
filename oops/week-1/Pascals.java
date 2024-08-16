import java.util.Scanner;

public class Pascals {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int order = sc.nextInt();
    pascals(order - 1);
  }

  private static void pascals(int n) {
    for (int i = 0; i <= n; i++) {
      int padding = n - i;

      for (int j = 0; j < padding; j++) {
        System.out.printf(" ");
      }

      for (int j = 0; j <= i; j++) {
        System.out.printf("%d ", getPascal(i, j));
      }
      System.out.println();
    }

    for (int i = n - 1; i >= 0; i--) {
      int padding = n - i;
      for (int j = 0; j < padding; j++) {
        System.out.printf(" ");
      }

      for (int j = 0; j <= i; j++) {
        System.out.printf("%d ", getPascal(i, j));
      }
      System.out.println();
    }

  }

  private static int getPascal(int row, int col) {
    return factorial(row) / (factorial(col) * factorial(row - col));
  }

  private static int factorial(int num) {
    int res = 1;
    for (int i = 2; i <= num; i++) {
      res *= i;
    }
    return res;
  }

}
