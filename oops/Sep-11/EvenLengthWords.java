import java.util.Scanner;

public class EvenLengthWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String word = sc.next();
      if (word.length() % 2 == 0)
        System.out.println(word);
    }

  }
}
