/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject.ChuongTrinhQuanLySach;

import java.util.ArrayList;
import java.util.List;
import part3ClassVaObject.SinhVien;

/**
 *
 * @author Giang Vu
 */
public class QuanLySach {
    // Khai bao bien chua danh sach sach
    private List<Sach> lstSach = new ArrayList();
    
    public void taoDuLieuBanDau()
    {
        // Khai bao 1 doi tuong Sach
        Sach objSach = new Sach();
        
        objSach.setMaSach("S001");
        objSach.setTenSach("Dac nhan tam");
        objSach.setTheLoai("Sach tu luc");
        objSach.setSoLuong(5);
        objSach.setTenTacGia("Dale Carnegie");
        lstSach.add(objSach);
        
        objSach.setMaSach("S002");
        objSach.setTenSach("Than dong Đat Viet");
        objSach.setTheLoai("Sach thieu nhi");
        objSach.setSoLuong(10);
        objSach.setTenTacGia("Le Linh");
        lstSach.add(objSach);
        
        objSach.setMaSach("S003");
        objSach.setTenSach("Ho Chi Minh toan tap");
        objSach.setTheLoai("Sach lich su");
        objSach.setSoLuong(1);
        objSach.setTenTacGia("Ho Chi Minh");
        lstSach.add(objSach);
    }
    
    public List<Sach> layDanhSachSach()
    {
        if (lstSach.isEmpty())
        {
            taoDuLieuBanDau();
        }
        return lstSach;
    }
    
    /**
     * Ham them moi thong tin sach
     * @param objSach doi tuong sach can them thong tin
     * @return True neu them thanh cong, False neu them that bai
     */
    public boolean themThongTinSach(Sach objSach)
    {
        if (objSach != null)
        {
            lstSach.add(objSach);
            return true;
        }
        return false;
    }
    
    public Sach timKiemSachTheoMa(String maSach)
    {
        Sach objSach = null;
        for (Sach s : lstSach)
        {
            if (s.getMaSach().equals(maSach))
            {
                objSach = s;
                break;
            }
        }
        return objSach;
    }
    
    public boolean capNhapThongTinSach(Sach objSach)
    {
        for(int i = 0; i < lstSach.size(); i++)
        {
            if (lstSach.get(i).getMaSach().equals(objSach.getMaSach()))
            {
                // Cap nhap lai thong tin cho doi tuong sach
                lstSach.set(i, objSach);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Ham xoa thong tin sach
     * @param maSach ma sach can xoa
     * @return True neu thanh cong, False neu that bai
     */
    public boolean xoaSach (String maSach)
    {
        // Lay doi tuong sach can xoa theo ma
        Sach objSach = timKiemSachTheoMa(maSach);
        if ((objSach) != null)
        {
            lstSach.remove(objSach);
            return true;
        }
        return false;
    }
    
}
