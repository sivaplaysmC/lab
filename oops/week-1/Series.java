import java.util.Scanner;

public class Series {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int q = sc.nextInt();
    while (q-- > 0) {
      solve(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
  }

  public static void solve(int a, int b, int n) {
    int acc = 0;
    for (int i = 0; i < n; i++) {
      acc += 1 << i;
      System.out.printf("%d ", a + b * acc);
    }
    System.out.println();
  }
}
