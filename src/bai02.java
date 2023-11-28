import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int sum = 0;

        while (a != 0) {
            System.out.println("nhâp vào 1 số nguyên: ");
            a = Integer.parseInt(scanner.nextLine());

            if (a % 2 != 0) {
                sum += a;
            }
        }

        System.out.println("tổng các số lẻ đã nhập là " + sum);
    }
}
