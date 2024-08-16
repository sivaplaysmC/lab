import java.util.Scanner;

public class IntInRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- != 0) {
      try {
        long d = sc.nextLong();
        System.out.println(d);
        if (d >= Short.MIN_VALUE && d <= Short.MAX_VALUE)
          System.out.println("Short");
        if (d >= Integer.MIN_VALUE && d <= Integer.MAX_VALUE)
          System.out.println("Integer");
        if (d >= Long.MIN_VALUE && d <= Long.MAX_VALUE)
          System.out.println("Long");
      } catch (Exception e) {
        System.out.println("Won't fit");
      }

    }

  }
}
