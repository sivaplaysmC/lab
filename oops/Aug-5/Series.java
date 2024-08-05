import java.util.Scanner;

/**
 * series with a, b, and q
 */
public class Series {

  private static void solve(int a, int b, int n) {
    for (int power = 0; power < n; power++) {
      a += b * Math.pow(2, power);
      System.out.printf("%d ", a);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int q = scanner.nextInt();
    while (q-- != 0) {
      int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt();
      solve(a, b, n);
    }

  }
}
