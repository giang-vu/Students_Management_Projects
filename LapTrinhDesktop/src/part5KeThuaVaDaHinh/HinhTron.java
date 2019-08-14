/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part5KeThuaVaDaHinh;

/**
 *
 * @author Giang Vu
 */
public class HinhTron extends Hinh {
    private final double PI = 3.14;
    
    private double banKinh = 0;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    @Override
    public double dienTich()
    {
        return PI * banKinh * banKinh;
    }
    
    @Override
    public void inThongTin()
    {
        System.out.println("Dien tich hinh tron la: " + dienTich());
    }
}
