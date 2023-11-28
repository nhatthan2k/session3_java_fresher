import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ hai: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ ba: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("**********************CACULATOR**********************");
            System.out.println("1. Tổng 3 số nguyên");
            System.out.println("2. Trung bình cộng của 3 số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất trong 3 số");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn:");

            int choice = Integer.parseInt(scanner.nextLine());

            int result;

            switch (choice) {
                case 1:
                    result = number1 + number2 + number3;
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 2:
                    result = (number1 + number2 +number3) / 3;
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 3:
                    int min = number1;
                    int max = number1;

                    if (min>number2) {
                        min = number2;
                    }
                    if (min > number3) {
                        min = number3;
                    }

                    if (max<number2) {
                        max = number2;
                    }
                    if (max < number3) {
                        max= number3;
                    }
                    System.out.printf("%d là số lớn nhât và %d là số nhỏ nhất\n ", max, min);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("bạn vui lòng lựa chọn từ 1 - 3");
            }
        } while (true);
    }
}
