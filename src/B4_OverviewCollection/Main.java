/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_OverviewCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        /**
         * ArrayList: mang dong 1 phan cua collection. No dc implement tu
         * inteface List
         */
//        ArrayList<Integer> listsArr = new ArrayList<>(); // C1: Khai bao array list bt thong qua arraylist
//        System.out.println("size = " + listsArr.size());
//        //add cac phan tu vao trong lists
//        listsArr.add(1);
//        System.out.println("size = " + listsArr.size());
//        listsArr.add(3);
//        System.out.println("size = " + listsArr.size());
//        listsArr.add(-3);
//        System.out.println("size = " + listsArr.size());
//        listsArr.add(9);
//        System.out.println("size = " + listsArr.size());
//        listsArr.add(0);
//        System.out.println(listsArr);
//        
//        // cach khai bao List
//        List<String>lists = new ArrayList<>();
//        // cac ham tuong tu nhu ben arraylist
        Scanner scanner = new Scanner(System.in);
        List<Student> lists = new ArrayList<>();
        System.out.println("Nhap ten sv 1: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi sv 1:");
        int tuoi = Integer.valueOf(scanner.nextLine());
        Student student = new Student(ten, tuoi);
        lists.add(student);
        System.out.println("Nhap ten sv 2: ");
        String tenSV2 = scanner.nextLine();
        System.out.println("Nhap tuoi sv 2:");
        int tuoiSV2 = Integer.valueOf(scanner.nextLine());
        Student student2 = new Student(tenSV2, tuoiSV2);
        lists.add(student2);

        System.out.println("For thuong");
        // c1: for thuong(for loop)
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        System.out.println("For each");
        // c2:for-each
        for (Student s : lists) {
            System.out.println(s);
        }
        // c3: for-each + lamda expersion 
        lists.forEach(s -> System.out.println(s));
        // https://github.com/AnestAcademy/Course-Java-OOP/blob/master/24.%20%20ArrayList.md
        // https://viettuts.vn/java-collection
        // https://github.com/AnhDT11/Course-JavaCore/blob/master/So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
        // tang dan theo tuoi 
        lists.sort((o1, o2) -> {
            return o1.getTuoi() - o2.getTuoi(); // so tru di. Chuoi dung compare to
        });
        System.out.println("Sau khi sort");
        for (Student s : lists) {
            System.out.println(s);
        }
    }
}
