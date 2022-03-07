import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            scanner = new Scanner(new FileInputStream("src/nums"));
        } catch (FileNotFoundException f) {
            System.err.println("Не удается найти указанный файл!");
        }
        String[] words = scanner.nextLine().split(" ");

        int[] arrNums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int num = Integer.parseInt(words[i]);
            arrNums[i] = num;
        }

        int result;
        try {
            result = arrNums[a - 1] / arrNums[b - 1];
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.err.println("На ноль делить нельзя!");
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.err.println("Вы вышли за границы массива!");
        }
    }
}
