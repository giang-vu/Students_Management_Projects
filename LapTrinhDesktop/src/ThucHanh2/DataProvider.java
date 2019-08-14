/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh2;

/**
 *
 * @author Giang Vu
 */
public class DataProvider {
    public static QuanLyThiSinh _QLThiSinh;
    public static QuanLyThiSinh QLThiSinh()
    {
        if (_QLThiSinh == null)
        {
            _QLThiSinh = new QuanLyThiSinh();
        }
        return _QLThiSinh;
    }
}
