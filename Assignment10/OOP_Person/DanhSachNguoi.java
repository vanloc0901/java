/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Person;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;

public class DanhSachNguoi {

    // Thuộc tính
    private ArrayList<Person> danhSachNguoi;

    // Constructor
    public DanhSachNguoi() {
        danhSachNguoi = new ArrayList<>();
    }

    // Phương thức thêm người vào danh sách
    public void themDanhSach(Person nguoi) {
        nguoi.nhapThongTin(); // Gọi phương thức nhập thông tin của đối tượng được truyền vào
        danhSachNguoi.add(nguoi); // Thêm đối tượng đã có đủ thông tin vào danh sách
        System.out.println("Da them thanh cong!");
    }

    // Phương thức xuất danh sách
    public void xuatDanhSach() {
        if (danhSachNguoi.isEmpty()) {
            System.out.println("Danh sach rong.");
        } else {
            System.out.println("\n--- DANH SACH ---");
            for (Person nguoi : danhSachNguoi) {
                nguoi.xuatThongTin();
            }
        }
    }

    public Person timTheoCMND(int cmnd) {
        for (Person nguoi : danhSachNguoi) {
            if (nguoi.getCmnd() == cmnd) {
                return nguoi;
            }
        }
        return null;
    }

    public boolean xoaTheoCMND(int cmnd) {
        Nguoi nguoiCanXoa = timTheoCMND(cmnd); 

        if (nguoiCanXoa != null) {
            danhSachNguoi.remove(nguoiCanXoa);
            return true; 
        }
        return false; 
    }
}
