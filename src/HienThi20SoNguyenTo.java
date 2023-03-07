import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("20 so nguyen to dau tien la");
        while (count < 20) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
