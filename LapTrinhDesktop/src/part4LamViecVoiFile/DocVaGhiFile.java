/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4LamViecVoiFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Giang Vu
 */
public class DocVaGhiFile {
    public static String docThongTinTuFile (String fileName)
    {
        String noiDung = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String dong = "";
            
            while ((dong = bufferedReader.readLine()) != null)
            {
                noiDung += dong + "\n";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ex) {
            System.err.println("Co loi xay ra. Chi tiet loi: " + ex.getMessage());
        }
        return noiDung;
    }
    
    public static String ghiThongTinRaFile (String noiDung, String fileName)
    {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(noiDung);
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("Co loi xay ra. Chi tiet loi: " + ex.getMessage());
        }
        return noiDung;
    }
}
