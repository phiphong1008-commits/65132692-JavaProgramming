import java.util.Scanner;

public class Vthetich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập 1 cạnh: ");
        double a = input.nextFloat();

        double thetich = Math.pow(a,3);
        System.out.printf("Thể tích là: %.1f",thetich);
    }
}
