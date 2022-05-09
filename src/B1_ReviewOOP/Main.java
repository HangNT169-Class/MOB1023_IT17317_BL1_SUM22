/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 4 dac trung cua oop - Dong goi: access modifier: public, protected,
     * default,private - Ke thua: extends - Da hinh - Truu tuong Dac trung cua 1
     * doi tuong(object) la thuoc tinh(cac bien) va phuong thuc(cac ham) Co 2
     * loai contructor: - contructor khong tham so - contructor co tham so Co 2
     * cach xu ly loi bo nho dem c1: Them nextLine() c2: Coi tat ca nhap tu ban
     * phim la String roi ep kieu ve kieu tuong ung
     */
    /**
     * Bai tap: Tao 1 class Nguoi gom cac thuoc tinh: ten-String,tuoi-int va cac
     * phuong thuc contructor, getter, setter Tao 1 class SinhVien ke thua tu
     * class Nguoi va them thuoc tinh mssv-String,diem-double va cac phuong thuc
     * contructor, getter, setter va display(): void Nhap thong tin cua 1 sinh
     * vien va in ra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();
        System.out.print("Nhap mssv:");
        String mssv = scanner.nextLine();
        System.out.print("Nhap diem:");
        double diem = Double.valueOf(scanner.nextLine());

        //c1: Dung set
//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setDiem(diem);
//        sinhVien.setMssv(mssv);
//        sinhVien.setTen(ten);
//        sinhVien.setTuoi(tuoi);
        SinhVien sinhVien = new SinhVien(mssv, diem, ten, tuoi);
        sinhVien.display();
    }
}
