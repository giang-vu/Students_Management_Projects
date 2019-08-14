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
public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double dienTich()
    {
        return chieuDai * chieuRong;
    }
    
    @Override
    public void inThongTin()
    {
        System.out.println("Dien tich hinh chu nhat la: " + dienTich());
    }
}
