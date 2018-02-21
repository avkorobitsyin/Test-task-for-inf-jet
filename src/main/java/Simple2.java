import java.util.Scanner;

/**
 * Created by avkor on 19.02.2018.
 */
public class Simple2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            String s = scanner.next();
            if (s.matches("^-{0,1}\\d*$")) {
                int n = Integer.parseInt(s);
                System.out.println(simpleDivisions(n));
                break;
            }
        }
    }

    public static String simpleDivisions(int n) {
        int a = 2;
        int number = n;
        String result = "";
        double sqrt = Math.sqrt(n);
        while (number > 1 && a <= sqrt) {
            if (number % a == 0) {
                result = result + a + " ";
                number /= a;
            } else if (a == 2) {
                a++;
            } else {
                a += 2;
            }
        }
        if (number != 1) {
            result = result + number;
        }
        return result;
    }

}
