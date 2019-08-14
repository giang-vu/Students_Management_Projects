/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuDungLib;
import TinhToanLib.*;

/**
 *
 * @author Giang Vu
 */
public class SuDungLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TinhToan tt = new TinhToan();
        int giaiThua = tt.giaiThua(5);
        System.out.println("Giai thua la: " + giaiThua);
    }
    
}
