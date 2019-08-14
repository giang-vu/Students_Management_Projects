/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Giang Vu
 */
public class QuanLySinhVien {
    // Khai bao bien chua danh sach sinh vien
    private List<SinhVien> lstSinhVien = new ArrayList();
    
    private void taoDuLieuBanDau()
    {
        // Khai bao cac doi tuong sinh vien
        SinhVien objSV = new SinhVien();
        
        objSV.setMaSV("SF001");
        objSV.setHoTen("Nguyen Minh Anh");
        objSV.setGioiTinh(1);
        //objSV.setNgaySinh(StringToDate("2009-12-31"));
        objSV.setDienThoai("0777090484");
        objSV.setEmail("anh.nguyen@gmail.com");
        objSV.setSoCMT("025562790");
        objSV.setDiaChi("Ha Noi");
        
        // Them vao danh sach
        lstSinhVien.add(objSV);
        
        // Khai bao doi tuong sinh vien thu 2
        objSV = new SinhVien("Nam Dinh");
        objSV.setMaSV("SF002");
        objSV.setHoTen("Trinh Van Ha");
        objSV.setGioiTinh(0);
        objSV.setDienThoai("0918324727");
        objSV.setEmail("ha.trinh@gmail.com");
        objSV.setSoCMT("025314761");
        
        // Them vao danh sach
        lstSinhVien.add(objSV);
        
        // Khai bao doi tuong sinh vien thu 2
        objSV = new SinhVien("SF003", "Nguyen Thi Hue", "0905655559", "hue.nguyen@gmail.com", "025586862", "Ha Nam");
        objSV.setGioiTinh(1);
        
        // Them vao danh sach
        lstSinhVien.add(objSV);
    }
    
    public List<SinhVien> timKiemSinhVien(String tuKhoa)
    {
        // Khai bao 1 danh sach chua ket qua cac doi tuong tim kiem 
        List<SinhVien> lstTimKiem = new ArrayList();
        
        if (!tuKhoa.isEmpty())
        {        
            // Xu ly loc
            for (SinhVien sv : lstSinhVien) 
            {
                if (sv.getMaSV().equals(tuKhoa) || sv.getHoTen().contains(tuKhoa))
                {
                    // Them vao danh sach
                    lstTimKiem.add(sv);
                }
            }
        }
        else
        {
            lstTimKiem = layDanhSachSinhVien();
        }
        return lstTimKiem;
    }
    
    /**
     * Ham lay danh sach sinh vien ban dau
     * @return, Danh sach sinh vien lay duoc trong he thong
     */
    public List<SinhVien> layDanhSachSinhVien()
    {
        if(lstSinhVien.isEmpty())
        {
            // Goi ham tao du lieu ban dau
            taoDuLieuBanDau();
        }
        return lstSinhVien;
    }
    
    /**
     * Ham them moi thong tin sinh vien
     * @param objSV doi tuong sinh vien can them
     * @return True neu them thong tin thanh cong, False neu them thong tin that bai
     */
    public boolean themSinhVien(SinhVien objSV)
    {
        if (objSV != null)
        {
            // Them vao danh sach
            lstSinhVien.add(objSV);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public SinhVien timKiemTheoMaSV(String maSV)
    {
        SinhVien objSV = null;
        for (SinhVien sv : lstSinhVien)
        {
            if (sv.getMaSV().equals(maSV))
            {
                objSV = sv;
                break;
            }
        }
        return objSV;
    }
    
    /**
     * Ham cap nhap thong tin sinh vien
     * @param objSV doi tuong sinh vien can cap nhap
     * @return True neu thanh cong, False neu that bai
     */
    public boolean capNhapSinhVien (SinhVien objSV)
    {
        for(int i = 0; i < lstSinhVien.size(); i++)
        {
            if (lstSinhVien.get(i).getMaSV().equals(objSV.getMaSV()))
            {
                // Cap nhap lai thong tin cho doi tuong sinh vien
                lstSinhVien.set(i, objSV);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Ham xoa thong tin sinh vien
     * @param maSV ma sinh vien can xoa
     * @return True neu thanh cong, False neu that bai
     */
    public boolean xoaSinhVien (String maSV)
    {
        // Lay doi tuong sinh vien can xoa theo ma
        SinhVien objSV = timKiemTheoMaSV(maSV);
        if ((objSV) != null)
        {
            lstSinhVien.remove(objSV);
            return true;
        }
        return false;
    }
    
}
