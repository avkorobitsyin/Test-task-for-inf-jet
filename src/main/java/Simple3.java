import java.util.Scanner;

/**
 * Created by avkor on 19.02.2018.
 */
public class Simple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        isPalindrome(s);
    }

    public static String reverseString(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        return n;
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll(" ", "");
        if (str.equalsIgnoreCase(reverseString(str))) {
            System.out.println("Палиндром");
            return true;
        } else {
            System.out.println("Не является палиндромом");
            return false;
        }
    }
}
