/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_Expection;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Expection la gi? Khi nay xay ra expection? 2. Nhung cach fix
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap tuoi:");
//
//        try {
//            // chua 1 hoac nhieu dong ma nghi ngo xay ra loi
//            int tuoi = sc.nextInt();
//        } catch (Exception e) {
//            // Khi xay ra loi thi se lam gi
//            System.out.println("Sai dinh dang roi");
//        } 
//        int a[] = {-2, 7, 6, 9, 0};
//        try {
//            System.out.println(a[0]);
//        } catch (Exception e) {
//            System.out.println("Mang khong du phan tu");
//        } finally {
//            // Du thanh cong hay that bai => auto vao
//            System.out.println("Ket thuc");
//        }

        try {
            System.out.println("Hien thi");
            throw new MyExpection("Hihi");
        } catch (MyExpection e) {
            System.out.println(e.getMessage());
        }
    }
}
