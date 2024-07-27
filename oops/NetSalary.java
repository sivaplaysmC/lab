import java.util.*;
import java.io.*;

public class NetSalary {
  public static void main(String[] args) {
    int base = 10000, allowance = 2000, deduction = 1000;
    System.out.printf("base = %d, allowance = %d, deduction = %d\n", base, allowance, deduction);
    System.out.printf("Net salary: %d\n", base + allowance - deduction);
  }
}
