// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเต็มที่ต้องการ: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("ป้อนตัวเลข " + n + " ตัว:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        sortNumbers(numbers);
        System.out.println("ตัวเลขที่เรียงลำดับ:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void sortNumbers(int[] arr) {
        Arrays.sort(arr);
    }
}