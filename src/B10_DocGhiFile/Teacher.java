/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class Teacher implements Serializable {  // dung de thuoc tinh khong bi lon xon khi doc file 

    private String ten;
    private int tuoi;
    private String namSinh;
    private String diaChi;
    private String truongDayHoc;

    public Teacher() {
    }

    public Teacher(String ten, int tuoi, String namSinh, String diaChi, String truongDayHoc) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.truongDayHoc = truongDayHoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTruongDayHoc() {
        return truongDayHoc;
    }

    public void setTruongDayHoc(String truongDayHoc) {
        this.truongDayHoc = truongDayHoc;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ten=" + ten + ", tuoi=" + tuoi + ", namSinh=" + namSinh + ", diaChi=" + diaChi + ", truongDayHoc=" + truongDayHoc + '}';
    }

}
