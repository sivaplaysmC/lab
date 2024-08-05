/*
 * Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each
 * digit of the number is equal to the number itself, then the number is called an Armstrong number.
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */

import java.util.Scanner;

public class Armstrong {

  private static boolean isArmstrong(int num) {
    int sum = 0;
    int copy = num;
    while (copy != 0) {
      sum += Math.pow(copy % 10, 3);
      copy /= 10;
    }
    return num == sum;
  }

  public static void main(String[] args) {
    for (int i = 1; i < 501; i++) {
      if (isArmstrong(i)) {
        System.out.println(i);
      }
    }
  }
}
