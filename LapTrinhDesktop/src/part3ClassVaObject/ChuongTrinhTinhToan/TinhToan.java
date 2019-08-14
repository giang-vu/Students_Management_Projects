/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3ClassVaObject.ChuongTrinhTinhToan;

import java.text.DecimalFormat;

/**
 *
 * @author Truong Giang
 */
public class TinhToan {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public String chuViHinhChuNhat (double chieuDai, double chieuRong)
    {
        return df2.format((chieuDai + chieuRong)*2);
    }

    public String dienTichHinhChuNhat (double chieuDai, double chieuRong)
    {
        return df2.format((chieuDai*chieuRong));
    }
    
    public String dienTichHinhThang (double canhDayLon, double canhDayNho, double chieuCao)
    {
        return df2.format(((canhDayLon + canhDayNho)*chieuCao/2));
    }
    
    final double PI = Math.PI;
    public String chuViHinhTron (double banKinh)
    {
        return df2.format((2*PI*banKinh));
    }

    public String dienTichHinhTron (double banKinh)
    {
        return df2.format((PI*Math.pow(banKinh, 2)));
    }
    
    public int tinhGiaiThua (int n)
    {
        int giaiThua = 1;
        for (int  i = 1; i <= n; i++)
        {
            giaiThua *= i;
        }
        return giaiThua;
    }
}
