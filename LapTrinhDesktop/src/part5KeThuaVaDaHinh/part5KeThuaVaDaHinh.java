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
public class part5KeThuaVaDaHinh {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Khai bao 1 doi tuong meo Tom
        Cat tom = new Cat();
        tom.setSoMat(2);
        tom.setSoChan(4);
        tom.setMauLong("Mau xam");
        System.out.println("Thong tin ve meo Tom: ");
        tom.inThongTin();
        
        // Khai bao 1 doi tuong cho John
        Dog john = new Dog();
        john.setSoMat(2);
        john.setSoChan(4);
        john.setMauLong("Mau vang");
        System.out.println("Thong tin ve cho John: ");
        john.inThongTin();
        
        int tong1 = TinhToan.tongHaiSo(5, 4);
        double tong2 = TinhToan.tongHaiSo(5.1, 4.1);
        
        // Khai bao 1 doi tuong hinh tron
        HinhTron ht = new HinhTron();
        ht.setBanKinh(3);
        ht.inThongTin();
        
        // Khai bao 1 doi tuong hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(5);
        hcn.setChieuRong(3);
        hcn.inThongTin();
    }
}
