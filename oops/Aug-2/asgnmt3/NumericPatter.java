/**
 * Write a java Code to display following pattern [4,5,6,6,7,7,8]initialize
 * value of a =3
 */
public class NumericPatter {
  public static void main(String[] args) {
    int a = 3;
    withSpacecomma(++a);
    withSpacecomma(++a);
    withSpacecomma(++a);
    withSpacecomma(a);
    withSpacecomma(++a);
    withSpacecomma(a);
    withSpacecomma(++a);
    System.out.println();
  }

  private static void withSpacecomma(int a) {
    System.out.printf("%d, ", a);
  }
}
