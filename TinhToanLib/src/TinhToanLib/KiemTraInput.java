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
public class KiemTraInput {
    
    /**
     * Ham kiem tra chuoi nhap vao 
     * @param data Chuoi du lieu nhap vao
     * @return True neu la chuoi so, False neu khong phai chuoi so
     */
    public static boolean isNumber(String data)
    {
        char arr[] = data.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            // Neu khong phai la so
            if (!Character.isDigit(arr[i]))
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Ham kiem tra du lieu co null hay empty khong
     * @param data Chuoi du lieu nhap vao
     * @return True neu la null hoac empty
     */
    public static boolean isNullOrEmpty(String data)
    {
        if (data == null)
        {
            return true;
        }
        if (data.trim().length() == 0)
        {
            return true;
        }
        return false;
    }
}
