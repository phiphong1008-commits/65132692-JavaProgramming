import java.util.Scanner;

public class DTB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập Họ và tên:");
        String ten = input.nextLine();

        System.out.print("Nhập Điểm Trung Bình:");
        float dtb = input.nextFloat();

        System.out.printf("%nHọ và tên là: %s ", ten);
        System.out.printf("%nĐiểm Trung Bình là: %.1f", dtb);

        input.close();
    }
}
