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
public class Animal {
    private int soChan;
    private int soMat;
    private String mauLong;

    public String tiengKeu()
    {
        return "";
    }
        
    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public int getSoMat() {
        return soMat;
    }

    public void setSoMat(int soMat) {
        this.soMat = soMat;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
    
    public void inThongTin()
    {
        System.out.println("So mat: " + soMat);
        System.out.println("So chan: " + soChan);
        System.out.println("Mau long: " + mauLong);
        System.out.println("Tieng keu: " + tiengKeu());
    }
}
