import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ hai: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        int result;

        do {
            System.out.println("*************CACULATOR***************");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. thoát");
            System.out.println("nhập lựa chon của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    result = number1 + number2;
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 2:
                    result = (number1>number2) ? (number1 + number2) : (number2 - number1);
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 4:
                    result = (number1>number2) ? (number1 / number2) : (number2 / number1);
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 5:
                    result = number1 % number2;
                    System.out.println("kết quả phép tính là: " + result);
                    break;
                case 6:

                    System.out.println("bạn vừa chọn Mỳ tôm không người lái");
                    break;
                case 7:

                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn vui lòng lựa chọn từ 1 - 7");
            }
        } while (true);
    }
}
