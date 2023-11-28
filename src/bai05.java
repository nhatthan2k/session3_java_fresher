import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị từ 1 - 10: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice < 10) {
            System.out.printf("bảng cửu chương %d\n", choice);
            for (int j = 1; j <= 10; j++) {
                int multiply = choice * j;
                System.out.printf("%d * %d = %d\n", choice, j, multiply);
            }
        }

        if (choice == 10) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("bảng cửu chương %d\n", i);
                for (int j = 1; j <= 10; j++) {
                    int multiply = i * j;
                    System.out.printf("%d * %d = %d\n", i, j, multiply);
                }
            }
        }
    }
}
