import java.util.Scanner;

public class Compare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();

    if (a != b)
      System.out.printf("%d != %d\n", a, b);
    else
      System.out.printf("%d != %d\n", a, b);

    if (a > b)
      System.out.printf("%d > %d\n", a, b);

    if (a >= b)
      System.out.printf("%d >= %d\n", a, b);

    if (a < b)
      System.out.printf("%d < %d\n", a, b);

    if (a <= b)
      System.out.printf("%d <= %d\n", a, b);

  }
}
