/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject.ChuongTrinhQuanLySach;

/**
 *
 * @author Giang Vu
 */
public class DataProvider {
    /**
     * Khai bao 1 doi tuong kieu static thuoc lop QuanLySach
     * de co the goi va dung doi tuong nay o nhieu noi
     */
    public static QuanLySach _QLSach;
    public static QuanLySach QLSach()
    {
        if (_QLSach == null)
        {
            _QLSach = new QuanLySach();
        }
        return _QLSach;
    }
}
