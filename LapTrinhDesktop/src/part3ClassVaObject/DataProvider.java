/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject;

/**
 *
 * @author Giang Vu
 */
public class DataProvider {
    /**
     * Khai bao 1 doi tuong kieu static thuoc lop QuanLySinhVien
     * de co the goi va dung doi tuong nay o nhieu noi
     */
    private static QuanLySinhVien _QLSinhVien;
    public static QuanLySinhVien QLSinhVien()
    {
        if(_QLSinhVien == null)
        {
            _QLSinhVien = new QuanLySinhVien();
        }
        return _QLSinhVien;
    }
}
