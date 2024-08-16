import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int side = sc.nextInt();
    pattern(side);
  }

  private static void pattern(int side) {
    for (int i = 1; i <= side; i++) {
      int padding = side - i;
      for (int j = 0; j < padding; j++) {
        System.out.printf("  ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.printf("* ");
      }
      System.out.println();
    }

    for (int i = side - 1; i > 0; i--) {
      int padding = side - i;
      for (int j = 0; j < padding; j++) {
        System.out.printf("  ");
      }
      for (int j = 2 * i - 1; j > 0; j--) {
        System.out.printf("* ");
      }
      System.out.println();
    }

  }

}
