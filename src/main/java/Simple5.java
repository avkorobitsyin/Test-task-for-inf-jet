import java.util.Scanner;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s1 = scanner.nextLine();
        System.out.println();
        System.out.print("Введите строку, которую будете искать в первой строке: ");
        String s2 = scanner.nextLine();
        if (findString(s1, s2)) {
            System.out.println("Первая строка содержит данную строку");
        } else {
            System.out.println("Не найдено");
        }
    }

    public static Boolean findString(String s1, String s2) {
        if (s1.contains(s2)) {
            return true;
        } else {
            return false;
        }
    }

}
