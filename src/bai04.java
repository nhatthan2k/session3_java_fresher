import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;

        while (a!=0) {
            System.out.println("nhập số nguyên: ");
            a = Integer.parseInt(scanner.nextLine());

            if (a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}
