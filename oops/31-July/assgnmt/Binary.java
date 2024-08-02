public class Binary {
  public static void main(String[] args) {
    byte a = 1;
    System.out.println(String.format("a %d", a));
    System.out.println(String.format("a << 1 %d", a << 1));
    System.out.println(String.format("a >> 1 %d", a >> 1));
  }
}
