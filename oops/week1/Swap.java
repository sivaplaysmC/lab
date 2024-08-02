import java.util.*;
import java.io.*;


public class Swap {
  public static void main(String[] args) {
    int a = 10, b = 20;
    System.out.printf("Before swap: %d %d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("After swap: %d %d\n", a, b);
  }
}
