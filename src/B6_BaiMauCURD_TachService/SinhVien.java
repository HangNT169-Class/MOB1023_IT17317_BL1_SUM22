/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_BaiMauCURD_TachService;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private String mssv;
    private String ten;
    private int tuoi;
    private String diaChi;
    private int gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String mssv, String ten, int tuoi, String diaChi, int gioiTinh) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] toDataRow() {
        return new Object[]{mssv, ten, tuoi, gioiTinh, diaChi};
    }
}
