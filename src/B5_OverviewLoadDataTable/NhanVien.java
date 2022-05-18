/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_OverviewLoadDataTable;

/**
 *
 * @author hangnt
 */
public class NhanVien {

    private String ten;
    private String loai;
    private boolean gender;
    private String soThich;

    public NhanVien() {
    }

    public NhanVien(String ten, String loai, boolean gender, String soThich) {
        this.ten = ten;
        this.loai = loai;
        this.gender = gender;
        this.soThich = soThich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public Object[] toDataRow() {
        return new Object[]{ten, loai, gender == true ? "Nam" : "Nữ", soThich};
    }
}
