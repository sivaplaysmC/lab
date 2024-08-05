/*
 *
 *     1
 *    212
 *   32123
 *  4321234
 * 543212345
 *
 */

public class Pattern {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {

      int padding = 5 - i;
      for (int j = 0; j < padding; j++)
        System.out.printf(" ");
      for (int j = i; j >= 1; j--) {
        System.out.printf("%d", j);
      }
      for (int j = 2; j <= i; j++)
        System.out.printf("%d", j);

      System.out.println();
    }
  }
}
