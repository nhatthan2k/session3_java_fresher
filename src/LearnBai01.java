import java.util.Scanner;

public class LearnBai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập giá trị đầu: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giá tri cuối: ");
        int b =Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (a<b) {
            for (int i = a; i<=b; i++) {
                if(i%2==0) {
                    sum += i;
                }
            }
        } else {
            System.out.println("khoảng bạn nhập không hợp lệ");
        }

        System.out.printf("tổng các số chẵn trong khoảng %d đến %d là: %d", a, b, sum);
    }
}
