public class Cont {
  public static void main(String[] args) {
    for (int i = 1; i <= 25; i++) {
      if (i % 10 == 0)
        continue;
      System.out.printf("%d ", i);
    }

  }
}
