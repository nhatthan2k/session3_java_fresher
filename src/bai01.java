public class bai01 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("các số chẵn từ 1 đến 10 là: ");
        for (int i=1; i <= 10; i++  ) {
            if (i%2==0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("có tổng là: " + sum);
    }
}
