import java.util.Scanner;
import static java.lang.Math.*;

public class SalaryCalculation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float hourlySal = sc.nextFloat();
    int numHours = sc.nextInt();
    int numWeeks = sc.nextInt();

    int overtime = max(numHours - 40, 0);

    double weeklySal = (numHours - overtime) * hourlySal + hourlySal * overtime * 1.5;

    weeklySal -= numHours < 20 ? 0.1 * weeklySal : 0;
    weeklySal *= numWeeks;

    System.out.printf("%.1f\n", weeklySal);

  }
}
