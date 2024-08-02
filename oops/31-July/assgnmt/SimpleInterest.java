import java.io.*;
import java.util.*;

class SimpleInterest {
  public static void main(String args[]) {
    int p = 100, r = 13, t = 3 ;
    float si = p * r * t / 100;

    System.out.printf("Principal: %d; Rate: %d; Time: %d\n", p, r,t);
    System.out.printf("SimpleInterest: %f\n", si);
  }
}
