/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4LamViecVoiFile;
import java.io.*;

/**
 *
 * @author Giang Vu
 */
public class LamViecVoiFile {

    /**
     * @param args the command line arguments
     */
    public static final String PATH = "C:\\Users\\Truong Giang\\Documents\\NetBeansProjects\\LapTrinhDesktop\\src\\part4LamViecVoiFile";
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Lam viec voi Bytes Stream
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH + "\\ReadFile.txt");
            int ch = 0;
            // Su dung vong lap de doc tung ky tu
            while((ch = fileInputStream.read()) != -1)
            {
                System.out.print((char)ch);
            }
            // Dong luong
            fileInputStream.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Khong tim thay file. Chi tiet loi: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Khong doc duoc file. Chi tiet loi: " + ex.getMessage());
        }
        
        try {
            // Ghi luong thong tin ra file
            FileOutputStream fileOutputStream = new FileOutputStream(PATH + "\\WriteFile.txt");
            // Khai bao 1 mang byte
            byte b[] = new byte[100];
            System.out.println("\nNhap noi dung can ghi: ");
            int num = System.in.read(b);
            // Ghi noi dung ra file
            fileOutputStream.write(b, 0, num);
            // Dong luong
            fileOutputStream.close();
        } catch (IOException ex) {
            System.out.println("Co loi xay ra khi ghi file. Chi tiet loi: " + ex.getMessage());
        }
        
        // Lam viec voi Characters Stream
        try {
            // Doc file
            String noiDung = "", dong = "";
            FileReader fileReader = new FileReader(PATH + "\\ReadFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((dong = bufferedReader.readLine()) != null) {
                noiDung += dong + "\n";
            }
            bufferedReader.close();
            fileReader.close();
            
            // Ghi file
            FileWriter fileWriter = new FileWriter(PATH + "\\WriteFile.txt");
            fileWriter.write(noiDung);
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("Co loi xay ra khi doc file. Chi tiet loi: " + ex.getMessage());
        }
    }
}
