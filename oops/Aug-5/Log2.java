/*
 * Compute the natural logarithm of 2, by adding up to n terms in the series
 * 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
 * where n is a positive integer and input by user.
 */

import java.util.Scanner;

/**
 * Log2
 */
public class Log2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double res = 1.0;
    boolean toggle = true;
    for (int i = 2; i <= n; i++)
      res += toggle ? -1.0 / i : 1.0 / i;

    System.out.println(res);

  }
}
