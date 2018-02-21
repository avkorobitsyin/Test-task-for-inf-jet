import java.util.Scanner;

/**
 * Created by avkor on 20.02.2018.
 */
public class Simple1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.print("Введите числа в строку через пробел: ");
            String s = scanner.nextLine();
            if (s.matches("^[-{0,1}\\d ]*$") && s.length() > 0) {
                String[] strs = s.split(" ");
                int[] array = new int[strs.length];
                for (int k = 0; k < strs.length; k++) {
                    array[k] = (Integer.parseInt(strs[k]));
                }

                if (array.length == 1) {
                    System.out.println(array[0]);
                    break;
                }
                if (array.length == 0) {
                    System.out.println("Введите хотя бы одно число");
                    continue;
                }
                System.out.println("Второе по величине число: " + returnSecondMax(array));
                break;
            } else {
                System.out.println("Убедитесь что вы ввели числа а не другие символы");
                continue;
            }
        }

    }


    public static int returnSecondMax(int[] array) {
        int removeCount = 0;

        for (int j = array.length - 1; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                if (array[k] < array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
        for (int l = 0; l < array.length - 1; l++) {
            if (array[l] == array[l + 1]) {
                removeCount++;
            }
        }

        int[] result = new int[array.length - removeCount];
        int m = 0;
        if (result.length == 1) {
            return array[0];
        }
        for (int l = 0; l < array.length - 1; l++) {
            if (array[l] != array[l + 1]) {
                result[m] = array[l];
                m++;
            }
        }

        return result[1];
    }
}



