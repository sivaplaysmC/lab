/**
 * Test
 */
public class Test {

  int a, b;

  Test() {
    a = 10;
    b = 20;
  }

  void display(Test obj) {
    System.out.println(" a = " + obj.a + " b = " + obj.b);
  }

  void get() {
    display(this);
  }

  public static void main(String[] args) {

  }
}
