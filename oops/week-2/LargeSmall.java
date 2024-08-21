import java.util.Scanner;
import static java.lang.Math.*;

/**
 * LargeSmall
 */
public class LargeSmall {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    solve(num);
  }

  private static void solve(int num) {
    int maxx = Integer.MIN_VALUE;
    int minn = Integer.MAX_VALUE;

    while (num > 0) {
      int digit = num % 10;

      maxx = max(digit, maxx);
      minn = min(digit, minn);

      num /= 10;
    }

    System.out.printf("%d %d\n", minn, maxx);
  }
}
