/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject;

import java.util.Date;

/**
 *
 * @author Giang Vu
 */
public class SinhVien {
    
    private String maSV;
    private String hoTen;
    private int gioiTinh; // Nam 0, Nu 1
    private Date ngaySinh;
    private String dienThoai;
    private String email;
    private String soCMT;
    private String diaChi;

    public SinhVien()
    {
    }
    
    public SinhVien(String diaChi)
    {
        this.diaChi = diaChi;
    }
    
    public SinhVien(String maSV, String hoTen, String dienThoai, String email, String soCMT, String diaChi)
    {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.email = email;
        this.soCMT = soCMT;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if (maSV.startsWith("SF"))
        {
            System.out.println("Day la hoc vien cua Stanford");
        }
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }
    
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
