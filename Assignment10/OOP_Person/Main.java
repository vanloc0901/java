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

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachNguoi quanLy = new DanhSachNguoi();
        int continueChoice = 1;

        do {
            System.out.println("\n--- MENU CHINH ---");
            System.out.println("1. Nhap thong tin (Sinh Vien / Giao Vien)");
            System.out.println("2. Xuat danh sach");
            System.out.print("Vui long chon chuc nang: ");
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Ban muon nhap cho doi tuong nao (1-Sinh vien, 2-Giao vien): ");
                    int objectChoice = scanner.nextInt();
                    if (objectChoice == 1) {
                        Person sv = new SinhVien();
                        quanLy.themDanhSach(sv);
                    } else if (objectChoice == 2) {
                        Person gv = new GiaoVien();
                        quanLy.themDanhSach(gv);
                    } else {
                        System.out.println("Lua chon khong hop le.");
                    }
                    break;
                case 2:
                    quanLy.xuatDanhSach();
                    break;
                case 3: // Chức năng tìm kiếm
                    System.out.print("Nhap so CMND can tim: ");
                    int cmndTimKiem = scanner.nextInt();
                    Person ketQuaTimKiem = quanLy.timTheoCMND(cmndTimKiem);
                    if (ketQuaTimKiem != null) {
                        System.out.println("Da tim thay thong tin:");
                        ketQuaTimKiem.xuatThongTin();
                    } else {
                        System.out.println("Khong tim thay nguoi co so CMND: " + cmndTimKiem);
                    }
                    break;
                case 4: // Chức năng xóa
                    System.out.print("Nhap so CMND can xoa: ");
                    int cmndXoa = scanner.nextInt();
                    boolean ketQuaXoa = quanLy.xoaTheoCMND(cmndXoa);
                    if (ketQuaXoa) {
                        System.out.println("Da xoa thanh cong nguoi co so CMND: " + cmndXoa);
                    } else {
                        System.out.println("Xoa that bai! Khong tim thay nguoi co so CMND: " + cmndXoa);
                    }
                    break;

                default:
                    System.out.println("Chuc nang khong ton tai.");
                    break;
            }

            System.out.print("\nTiep tuc khong? (1-co, 0-khong): ");
            continueChoice = scanner.nextInt();

        } while (continueChoice == 1);

        System.out.println("Ket thuc chuong trinh.");
        scanner.close();
    }
}
