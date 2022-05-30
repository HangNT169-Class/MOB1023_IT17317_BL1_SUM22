/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Tao class Teacher gom cac thuoc tinh: ten, tuoi,namSinh, diaChi,
     * truongDayHoc. Va cac contrutor, getter, setter. Ghi 5 doi tuong Teacher
     * vao file. Xuat file ra
     */
    public void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {
        // Kiem tra su ton tai cua file
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                // create file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // tao 5 list
        List<Teacher> lists = new ArrayList<>();
        lists.add(new Teacher("ten1", 10, "2000", "ha noi", "FPTPoly "));
        lists.add(new Teacher("ten2", 11, "2010", "ha noi1", "FPTPoly1 "));
        lists.add(new Teacher("ten3", 12, "2020", "ha noi2", "FPTPoly2 "));
        lists.add(new Teacher("ten4", 13, "2030", "ha noi3", "FPTPoly3 "));
        lists.add(new Teacher("ten5", 14, "2040", "ha noi4", "FPTPoly4 "));

        // Ghi file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Teacher teacher : lists) {
            oos.writeObject(teacher);
        }

        // close
        oos.close();
        fos.close();
    }

    // Doc file
    public void docFileObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
        // Kiem tra su ton tai cua file
        File file = new File("test.txt");
        if (!file.exists()) {
            try {
                // create file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Doc file
        FileInputStream fis = new FileInputStream(file);// mo file
        ObjectInputStream ois = new ObjectInputStream(fis);// dung de doc data trong file

        Teacher teacherInput = new Teacher();
        List<Teacher> lists = new ArrayList<>();

        // doc toi khi dong khong con file
        while (fis.available() > 0) {
            teacherInput = (Teacher) ois.readObject();
            lists.add(teacherInput);
        }

        // hien thi thong tin list
        for (Teacher teacher : lists) {
            System.out.println(teacher.toString());
        }

        // close 
        ois.close();
        fis.close();
    }

    public static void main(String[] args) {
        try {
            new Main().docFileObjectInputStream();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
