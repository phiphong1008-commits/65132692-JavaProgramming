package Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Đổi từ VND sang USD");
        System.out.println("2. Đổi từ USD sang VND");
        System.out.printf("Chọn 1 or 2:");
        int choice = input.nextInt();
        System.out.printf("\n");

        if (choice == 1) {
            System.out.printf("Mời bạn nhập số VND cần đổi sang USD:");
            double money = input.nextDouble();
            System.out.printf("Số USD bạn có sau khi đổi là: %.3f",  money/25000);
        }
        else if (choice == 2) {
            System.out.printf("Mời bạn nhập số USD cần đổi sang VND:");
            double money = input.nextDouble();
            System.out.printf("Số VND bạn có sau khi đổi là: %.3f",  money*25000);
        }
    }
}
