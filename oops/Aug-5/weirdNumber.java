/*
 * 1. WeirdNumber
 */

import java.util.Scanner;

public class weirdNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    if (isWeird(num)) {
      System.out.println("Weird");
    } else {
      System.out.println("Not weird");
    }

  }

  private static boolean isBetween(int num, int begin, int end) {
    return num <= end && num >= begin;
  }

  private static boolean isWeird(int num) {
    if (num % 2 == 1) {
      return true;
    }
    if (isBetween(num, 2, 5)) {
      return false;
    }
    if (isBetween(num, 6, 20)) {
      return true;
    }
    return false;

  }

}
