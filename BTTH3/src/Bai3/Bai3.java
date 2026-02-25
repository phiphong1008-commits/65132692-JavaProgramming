package Bai3;

import java.io.*;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====VIẾT NHẬT KÝ=====");
        String noidung = sc.nextLine();

        try
        {
            FileWriter fw = new FileWriter("nhatky.txt", true);
            fw.write(noidung);
            fw.close();
        }catch (IOException e){
            System.out.println("Lỗi khi ghi file"+e.getMessage());
        }


        System.out.println("=====NỘI DUNG NHẬT KÝ=====");
        try{
            BufferedReader br = new BufferedReader(new FileReader("nhatky.txt"));
            String line=br.readLine();
            while(line!=null){System.out.println(line);}
            br.close();
        }catch (IOException e){
            System.out.println("Lỗi khi đọc file "+e.getMessage());
        }
        sc.close();
    }
}
