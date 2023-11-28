import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*************Breakfast Menu***************");
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Phở bò Kobe");
            System.out.println("3. Phở gà Việt Nam");
            System.out.println("4. Xôi trứng thịt");
            System.out.println("5. Bánh mỳ trứng");
            System.out.println("6. Mỳ tôm không người lái");
            System.out.println("7. Thoát");
            System.out.println("nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("bạn vừa chọn Phở tôm hùm");
                    break;
                case 2:
                    System.out.println("bạn vừa chọn Phở bò Kobe");
                    break;
                case 3:
                    System.out.println("bạn vừa chọn Phở gà Việt Nam");
                    break;
                case 4:
                    System.out.println("bạn vừa chọn Xôi trứng thịt");
                    break;
                case 5:
                    System.out.println("bạn vừa chọn Bánh mỳ trứng");
                    break;
                case 6:
                    System.out.println("bạn vừa chọn Mỳ tôm không người lái");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn vui lòng lựa chọn từ 1 - 7");
            }

        }while (true);
    }
}
