import java.util.Scanner;
import java.util.Locale;

public class AreaDoCirculo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    double raio, area;

    raio = sc.nextDouble();
    area = 3.14159 * Math.pow(raio, 2);

    System.out.printf("A=%.4f%n", area);

    sc.close();
  }
}
