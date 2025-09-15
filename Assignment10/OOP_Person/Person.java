/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment10.OOP_Person;

/**
 *
 * @author Administrator
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    // Thuộc tính
    protected String hoVaTen;
    protected Date ngaySinh;
    protected String gioiTinh;
    protected int cmnd;

    // Constructors
    public Person() {
    }

    public Person(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    // Getters and Setters
    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        this.hoVaTen = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Nhap so CMND: ");
        this.cmnd = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Xử lý nhập ngày sinh
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Không cho phép ngày không hợp lệ (ví dụ: 32/13/2023)
        boolean ngayHopLe = false;
        while (!ngayHopLe) {
            System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
            String ngaySinhStr = scanner.nextLine();
            try {
                this.ngaySinh = dateFormat.parse(ngaySinhStr);
                ngayHopLe = true;
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le. Vui long nhap lai.");
            }
        }
    }

    // Phương thức xuất thông tin
    public void xuatThongTin() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ho ten: " + hoVaTen + ", Gioi tinh: " + gioiTinh + ", CMND: " + cmnd
                + ", Ngay sinh: " + (ngaySinh != null ? dateFormat.format(ngaySinh) : "Chua co"));
    }
}
