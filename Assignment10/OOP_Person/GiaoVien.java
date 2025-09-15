/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Person;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class GiaoVien extends Person {
    // Thuộc tính riêng
    private String maGiaoVien;
    private String xepLoaiThiDua;

    // Constructors
    public GiaoVien() {
        super();
    }

    // Getters and Setters
    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    // Phương thức xếp loại thi đua
    public void xepLoaiThiDua() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--- Xep loai thi dua ---");
            System.out.println("1. Loai A");
            System.out.println("2. Loai B");
            System.out.println("3. Loai C");
            System.out.print("Chon xep loai: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    this.xepLoaiThiDua = "Loai A";
                    break;
                case 2:
                    this.xepLoaiThiDua = "Loai B";
                    break;
                case 3:
                    this.xepLoaiThiDua = "Loai C";
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice < 1 || choice > 3);
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma giao vien: ");
        this.maGiaoVien = scanner.nextLine();
        xepLoaiThiDua();
    }

    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        System.out.print("Giao Vien - ");
        super.xuatThongTin();
        System.out.println(", Ma GV: " + maGiaoVien + ", Xep loai: " + xepLoaiThiDua);
    }
}