import java.util.Scanner;

public class ScannerWithString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    Scanner wordScanner = new Scanner(word).useDelimiter(" ");
    while (wordScanner.hasNext()) {
      System.out.println(wordScanner.next());
    }
    word
        .chars()
        .map(ascii -> ascii + 2)

    ;
    sc.close();
  }
}
