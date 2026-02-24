 package Bai1;
//bài tính tiền điện bậc thang

 import java.util.Scanner;

 public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời nhập số lượng kwH: ");
        double nhap = sc.nextDouble();
        System.out.printf("\n");
        int tongtien = 0;
        if (nhap > 0 && nhap < 50){
            System.out.printf("Tong tien cua ban la: %.3f ", nhap *= 1850);
        }else if (nhap >= 50 && nhap < 100){
            System.out.printf("Tong tien cua ban la: %.3f ",(49*1850)+((nhap - 49)*2000));
        }else if (nhap >= 100){
            System.out.printf("Tong tien cua ban la: %.3f ",(49*1850)+(50*2000)+((nhap - 100) * 3000));
        }
    }
}