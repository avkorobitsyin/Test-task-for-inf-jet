import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by avkor on 20.02.2018.
 */
public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку которую будете декодировать: ");
        String s = scanner.nextLine();
        System.out.println("Декодированая строка: " + rleDecoding(s));
    }

    public static String rleDecoding(String s) {
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]+|[а-яА-я]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int n = Integer.parseInt(matcher.group());
            matcher.find();
            while (n-- != 0) {
                buffer.append(matcher.group());
            }
        }
        return buffer.toString();
    }
}
