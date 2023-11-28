import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập 1 số nguyên: ");
        int number = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("**********************PRACTICE**********************");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3. In ra các ước số chẵn của n");
            System.out.println("4. In ra các ước số lẻ và số lượng các ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. thoát");
            System.out.println("lựa chon của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    for(int i = number; i>=2; i--) {
                        if(i%2==0) {
                            System.out.printf("%d\t",i);
                        }
                    }
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 1; i<=number; i++) {
                        System.out.printf("%d\t",i);
                        sum += i;
                    }
                    System.out.println("dãy số có tổng là: "+ sum);
                    break;
                case 3:
                    for (int i = 1; i<=number; i++) {
                        if (number%i==0 && i%2==0){
                            System.out.printf("%d\t",i);
                        }
                    }
                    break;
                case 4:
                    int index = 0;
                    for (int i = 1; i<=number; i++) {
                        if (number%i==0 && i%2!=0){
                            System.out.printf("%d\t",i);
                            index++;
                        }
                    }
                    System.out.println("số ước lẻ của n là: " + index);
                    break;
                case 5:
                    int maxDivisor = 0;
                    for (int i = number; i>=1; i--) {
                        if (number%i==0 && i%2!=0){
                            maxDivisor = i;
                            break;
                        }
                    }
                    System.out.println("số ước lẻ lớn nhất của n là: " + maxDivisor);
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn vui lòng lựa chọn từ 1 - 6");
            }
        }while (true);
    }
}
