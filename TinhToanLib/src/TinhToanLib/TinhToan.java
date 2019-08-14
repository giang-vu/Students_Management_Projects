package TinhToanLib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giang Vu
 */
public class TinhToan {
    private final double PI = 3.14;
    
    /**
     * Ham tinh dien tich hinh tron
     * @param banKinh Do dai ban kinh hinh tron
     * @return Dien tich hinh tron
     */
    public double dientichHinhTron(double banKinh)
    {
        return PI*banKinh*banKinh;
    }
    
    /**
     * Ham tinh chu vi hinh tron
     * @param banKinh Do dai ban kinh hinh tron
     * @return Chu vi hinh tron
     */
    public double chuViHinhTron(double banKinh)
    {
        return 2*PI*banKinh;
    }
    
    /**
     * Ham tinh dien tich hinh thang
     * @param dayLon Do dai day lon hinh thang
     * @param dayBe Do dai day be hinh thang
     * @param chieuCao Do dai chieu cao hinh thang
     * @return Dien tich hinh thang
     */
    public double dienTichHinhThang(double dayLon, double dayBe, double chieuCao)
    {
        return (dayLon + dayBe)*chieuCao/2;
    }
    
    /**
     * Ham tinh giai thua 
     * @param n So tu nhien can tinh giai thua
     * @return Giai thua cua so tu nhien can tinh
     */
    public int giaiThua(int n)
    {
        int ketQua = 1;
        for (int i = n; i > 0; i--)
        {
            ketQua *= i;
        }
        return ketQua;
    }
}
