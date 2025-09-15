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

public class SinhVien extends Person {
    // Thuộc tính riêng
    private String maSinhVien;
    private String renLuyen;

    // Constructors
    public SinhVien() {
        super();
    }

    // Getters and Setters
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }

    // Phương thức đánh giá rèn luyện
    public void danhGiaRenLuyen() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--- Danh gia ren luyen ---");
            System.out.println("1. Gioi");
            System.out.println("2. Kha");
            System.out.println("3. Trung binh");
            System.out.println("4. Yeu");
            System.out.print("Chon muc do ren luyen: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    this.renLuyen = "Gioi";
                    break;
                case 2:
                    this.renLuyen = "Kha";
                    break;
                case 3:
                    this.renLuyen = "Trung binh";
                    break;
                case 4:
                    this.renLuyen = "Yeu";
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice < 1 || choice > 4);
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); // Gọi phương thức của lớp cha để nhập thông tin chung
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSinhVien = scanner.nextLine();
        danhGiaRenLuyen(); // Gọi phương thức đánh giá ngay sau khi nhập mã sinh viên
    }

    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        System.out.print("Sinh Vien - ");
        super.xuatThongTin(); // Gọi phương thức của lớp cha để hiển thị thông tin chung
        System.out.println(", Ma SV: " + maSinhVien + ", Ren luyen: " + renLuyen);
    }
}