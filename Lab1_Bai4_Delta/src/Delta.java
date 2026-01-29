import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = input.nextDouble();

        System.out.print("Nhập b: ");
        double b = input.nextDouble();

        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        Double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("\n=> Giá trị của Delta là: %.2f\n", delta);

        if (delta >= 0) {
            Double canDelta = Math.sqrt(delta);
            System.out.printf("=> Căn bậc hai của Delta là: %.2f\n", canDelta);
        } else {
            System.out.println("=> Delta nhỏ hơn 0, không thể tính căn bậc hai");
        }

        input.close();

    }
}
