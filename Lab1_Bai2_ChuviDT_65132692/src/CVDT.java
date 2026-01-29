import java.util.Scanner;

public class CVDT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        Double D = input.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        Double R = input.nextDouble();

        Double chuVi = (D + R) * 2;
        Double dienTich = D * R;
        Double canhNho = chuVi /2 - D;

        System.out.printf("Chu vi là: %.1f", chuVi);
        System.out.printf("%nDiện tích là: %.1f", dienTich);
        System.out.printf("%nCạnh nhỏ là: %.1f",  canhNho );


        input.close();
    }
}
