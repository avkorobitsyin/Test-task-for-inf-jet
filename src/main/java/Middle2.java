import java.util.Scanner;

/**
 * Created by avkor on 20.02.2018.
 */
public class Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку которую будете кодировать: ");
        String s = scanner.nextLine();
        System.out.println("Закодированая строка: " + rleCoding(s));
    }

    public static String rleCoding(String s) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            int kol = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                kol++;
                i++;
            }
            buffer.append(kol);
            buffer.append(s.charAt(i));
        }
        return buffer.toString();
    }
}
