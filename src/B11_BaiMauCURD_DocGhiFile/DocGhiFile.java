/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_BaiMauCURD_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DocGhiFile {

    public String ghiFile(String path, List<SinhVien> lists) {
        String result = "";
        try {
            // Kiem tra su ton tai cua file
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            // Ghi file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (SinhVien sv : lists) {
                oos.writeObject(sv);
            }

            // close
            oos.close();
            fos.close();
            result = "Ghi file thanh cong";
        } catch (Exception e) {
            result = "Ghi flie that bai";
        }
        return result;
    }

    public String docFile(String path, List<SinhVien> lists) {
        try {
            // Kiem tra su ton tai cua file
            File file = new File(path);
            if (!file.exists()) {
                return "File khong ton tai hihi";
            }
            // Doc file
            FileInputStream fis = new FileInputStream(file);// mo file
            ObjectInputStream ois = new ObjectInputStream(fis);// dung de doc data trong file

            SinhVien sv = new SinhVien();

            // doc toi khi dong khong con file
            while (fis.available() > 0) {
                sv = (SinhVien) ois.readObject();
                lists.add(sv);
            }

            // close 
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}
