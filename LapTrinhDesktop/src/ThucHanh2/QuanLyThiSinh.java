/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giang Vu
 */
public class QuanLyThiSinh {

    // Khai bao bien chua danh sach sinh vien
    private List<ThiSinh> lstThiSinh = new ArrayList();

    private void taoDuLieuBanDau() {
        try {
            String PATH = "C:\\Users\\Truong Giang\\Documents\\NetBeansProjects\\LapTrinhDesktop\\src\\ThucHanh2";
            FileReader fileReader = new FileReader(PATH + "\\tuyensinh.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String dong = "";

            while ((dong = bufferedReader.readLine()) != null) {
                String[] words = dong.split(";");
                ThiSinh objTS = new ThiSinh();

                objTS.setSoBaoDanh(words[0]);
                objTS.setHoTen(words[1]);
                if (words[2].equals("0")) {
                    objTS.setGioiTinh("Nam");
                } else if (words[2].equals("1")) {
                    objTS.setGioiTinh("Nu");
                }
                objTS.setNgaySinh(words[3]);
                /*
                 DateFormat date = new SimpleDateFormat("dd/MM/yy");
                 try {
                 objTS.setNgaySinh(date.parse(words[3]));
                 } catch (ParseException ex) {
                 System.err.println("Loi chuyen doi ngay sinh. Chi tiet loi: " + ex.getMessage());
                 }
                 */
                objTS.setDiaChi(words[4]);
                objTS.setDiemToan(Float.parseFloat(words[5]));
                objTS.setDiemLy(Float.parseFloat(words[6]));
                objTS.setDiemHoa(Float.parseFloat(words[7]));

                // Them vao danh sach
                lstThiSinh.add(objTS);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ex) {
            System.err.println("Co loi xay ra. Chi tiet loi: " + ex.getMessage());
        }
    }

    /**
     * Ham lay danh sach thi sinh ban dau
     *
     * @return, Danh sach thi sinh lay duoc trong he thong
     */
    public List<ThiSinh> layDanhSachThiSinh() {
        if (lstThiSinh.isEmpty()) {
            // Goi ham tao du lieu ban dau
            taoDuLieuBanDau();
        }
        return lstThiSinh;
    }

    /**
     * Ham tim thi sinh co diem cao nhat
     *
     * @param lstDanhSach danh sach thi sinh truyen vao
     * @return doi tuong thi sinh co diem cao nhat
     */
    public ThiSinh thiSinhDiemCaoNhat(List<ThiSinh> lstDanhSach) {
        float maxTongDiem = 0;
        ThiSinh objTS = new ThiSinh();
        for (ThiSinh ts : lstDanhSach) {
            if (ts.getTongDiem() >= maxTongDiem) {
                maxTongDiem = ts.getTongDiem();
                objTS = ts;
            }
        }
        return objTS;
    }

    /**
     * Ham loc danh sach top 5 thi sinh diem cao nhat
     *
     * @return danh sach top 5
     */
    public List<ThiSinh> danhSachTop5DiemCaoNhat() {
        /*
         // Khai bao 1 danh sach tam thoi duoc copy tu lstThiSinh
         List<ThiSinh> lstThiSinhTemp = new ArrayList<>(lstThiSinh);
        
         // Khai bao Comparator so sanh tong diem
         Comparator<ThiSinh> soSanhTongDiem = (ThiSinh ts1, ThiSinh ts2) -> Float.compare(ts1.getTongDiem(), ts2.getTongDiem());
 
         // Sap xep danh sach theo tong diem giam dan 
         Collections.sort(lstThiSinhTemp, soSanhTongDiem.reversed());
        
         // Khai bao 1 danh sach chua thi sinh top 5 diem cao nhat
         List<ThiSinh> lstTop5DiemCaoNhat = lstThiSinhTemp.subList(0, 5);
        
         /*
         // Khai bao 1 danh sach top 5 diem cao nhat
         List<ThiSinh> lstTop5DiemCaoNhat = new ArrayList();
        
         for (int i = 0; i < 5; i++) {
         lstTop5DiemCaoNhat.add(thiSinhDiemCaoNhat(lstThiSinhTemp));
         lstThiSinhTemp.remove(thiSinhDiemCaoNhat(lstThiSinhTemp));
         }
         */

        //return lstTop5DiemCaoNhat;
        List<ThiSinh> lstTop5 = new ArrayList();

        List<ThiSinh> lstTatCa = lstThiSinh;

        //Sap xep thi sinh theo diem tu cao xuong thap
        ThiSinh temp = null;
        boolean doiCho = false;
        for (int i = 0; i < lstTatCa.size() - 1; i++) {
            for (int j = i + 1; j < lstTatCa.size(); j++) {
                if (lstTatCa.get(i).getTongDiem() < lstTatCa.get(j).getTongDiem()) {
                    doiCho = true;
                } else {
                    if (lstTatCa.get(i).getTongDiem() == lstTatCa.get(j).getTongDiem()) {
                        if ((lstTatCa.get(i).getDiemToan() < lstTatCa.get(j).getDiemToan())
                                && !lstTatCa.get(j).getDiaChi().equals("Hà Nội")) {
                            doiCho = true;
                        }
                    }
                }
                if (doiCho) {
                    // Thuc hien doi cho
                    temp = lstTatCa.get(i);
                    lstTatCa.set(i, lstTatCa.get(j));
                    lstTatCa.set(j, temp);
                }
                doiCho = false;
            }
        }

        // Lay top 5 sau khi sap xep
        for (int i = 0; i < 5; i++) {
            lstTop5.add(lstTatCa.get(i));
        }
        
        return lstTop5;
    }

    /**
     * Ham loc danh sach thi sinh dat diem san
     *
     * @return danh sach thi sinh dat diem san
     */
    public List<ThiSinh> danhSachDatDiemSan() {
        float diemSan = 15;
        // Khai bao 1 danh sach thi sinh dat diem san
        List<ThiSinh> lstDiemSan = new ArrayList();
        for (ThiSinh ts : lstThiSinh) {
            if (ts.getTongDiem() >= diemSan) {
                lstDiemSan.add(ts);
            }
        }
        return lstDiemSan;
    }

    /**
     * Ham loc danh sach thi sinh co diem liet
     *
     * @return danh sach thi sinh co diem liet
     */
    public List<ThiSinh> danhSachCoDiemLiet() {
        // Khai bao 1 danh sach thi sinh co diem liet
        List<ThiSinh> lstDiemLiet = new ArrayList();
        for (ThiSinh ts : lstThiSinh) {
            if (ts.getDiemToan() == 1 || ts.getDiemLy() == 1 || ts.getDiemHoa() == 1) {
                lstDiemLiet.add(ts);
            }
        }
        return lstDiemLiet;
    }

    /**
     * Ham tim kiem thi sinh theo so bao danh
     *
     * @param soBaoDanh so bao danh nhap vao
     * @return doi tuong thi sinh tim thay
     */
    public ThiSinh timKiemThiSinhTheoSoBaoDanh(String soBaoDanh) {
        ThiSinh objTS = null;
        for (ThiSinh ts : lstThiSinh) {
            if (ts.getSoBaoDanh().equals(soBaoDanh)) {
                objTS = ts;
                break;
            }
        }
        return objTS;
    }

    /**
     * Ham them moi thong tin thi sinh
     *
     * @param objTS doi tuong thi sinh can them
     * @return True neu them thong tin thanh cong, False neu them thong tin that
     * bai
     */
    public boolean themThiSinh(ThiSinh objTS) {
        if (objTS != null) {
            // Them vao danh sach
            lstThiSinh.add(objTS);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Ham cap nhap thong tin thi sinh
     *
     * @param objTS doi tuong thi sinh can cap nhap
     * @return True neu thanh cong, False neu that bai
     */
    public boolean capNhapThiSinh(ThiSinh objTS) {
        for (int i = 0; i < lstThiSinh.size(); i++) {
            if (lstThiSinh.get(i).getSoBaoDanh().equals(objTS.getSoBaoDanh())) {
                // Cap nhap lai thong tin cho doi tuong thi sinh
                lstThiSinh.set(i, objTS);
                return true;
            }
        }
        return false;
    }

    /**
     * Ham xoa thong tin thi sinh
     *
     * @param soBaoDanh so bao danh thi sinh can xoa
     * @return True neu thanh cong, False neu that bai
     */
    public boolean xoaThiSinh(String soBaoDanh) {
        // Lay doi tuong thi sinh can xoa theo ma
        ThiSinh objTS = timKiemThiSinhTheoSoBaoDanh(soBaoDanh);
        if ((objTS) != null) {
            lstThiSinh.remove(objTS);
            return true;
        }
        return false;
    }
}
