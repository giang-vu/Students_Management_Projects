/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6LamViecVoiJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giang Vu
 */
public class QuanLySinhVien {

    // Khai bao bien chua danh sach sinh vien
    private List<SinhVien> lstSinhVien = new ArrayList();

    public List<SinhVien> timKiemSinhVien(String tuKhoa) {
        // Khai bao 1 danh sach chua ket qua cac doi tuong tim kiem 
        List<SinhVien> lstSinhVien = new ArrayList();
        // Ket noi den database can lam viec
        Connection connection = null;
        try {
            connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement command = connection.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, SoCMT, DiaChi, MaKhoa FROM sinhvien WHERE 1=1";

            if (!tuKhoa.isEmpty()) {
                strSQL += " AND (MaSV = '" + tuKhoa + "' OR HoTen like '%" + tuKhoa + "%')";
            }

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = command.executeQuery(strSQL);

            // Dung vong lap de doc tung dong roi dua ve danh sach
            SinhVien objSV = null;
            while (rs.next()) {
                objSV = new SinhVien();
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getBoolean("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setSoCMT(rs.getString("SoCMT"));
                objSV.setDiaChi(rs.getString("DiaChi"));
                objSV.setMaKhoa(rs.getString("MaKhoa"));

                // Them vao danh sach
                lstSinhVien.add(objSV);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally // Sau khi thuc hien xong thi dong ket noi
        {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lstSinhVien;
    }

    /**
     * Ham lay danh sach sinh vien ban dau
     *
     * @return, Danh sach sinh vien lay duoc trong he thong
     */
    public List<SinhVien> layDanhSachSinhVien() {
        // Khai bao 1 doi tuong danh sach sinh vien
        List<SinhVien> lstSinhVien = new ArrayList();
        try {
            // Ket noi den database can lam viec
            Connection connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh MySQL de thuc hien cong viec
            Statement command = connection.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, SoCMT, DiaChi, MaKhoa FROM sinhvien";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = command.executeQuery(strSQL);

            // Khai bao 1 doi tuong sinh vien
            SinhVien objSV = null;

            // Dung vong lap de doc tung dong ket qua roi dua vao danh sach
            while (rs.next()) {
                objSV = new SinhVien();
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getBoolean("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setSoCMT(rs.getString("SoCMT"));
                objSV.setDiaChi(rs.getString("DiaChi"));
                objSV.setMaKhoa(rs.getString("MaKhoa"));

                // Them vao danh sach
                lstSinhVien.add(objSV);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstSinhVien;
    }

    /**
     * Ham them moi thong tin sinh vien
     *
     * @param objSV doi tuong sinh vien can them
     * @return True neu them thong tin thanh cong, False neu them thong tin that
     * bai
     */
    public boolean themSinhVien(SinhVien objSV) {
        try {
            // Ket noi den database can lam viec
            Connection connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh MySQL de thuc hien cong viec
            Statement command = connection.createStatement();

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String ngaySinh = dateFormat.format(objSV.getNgaySinh());

            int gioiTinh;

            if (objSV.getGioiTinh() == true) {
                gioiTinh = 1;
            } else {
                gioiTinh = 0;
            }
            // Khai bao cau lenh truy van
            String strSQL = String.format("INSERT INTO sinhvien(MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, SoCMT, DiaChi, MaKhoa)"
                    + "VALUES ('%s', '%s', '%d', '%s', '%s', '%s', '%s', '%s', '%s')",
                    objSV.getMaSV(), objSV.getHoTen(), gioiTinh, ngaySinh, objSV.getDienThoai(), objSV.getEmail(), objSV.getSoCMT(), objSV.getDiaChi(), objSV.getMaKhoa());

            // Neu so dong thuc hien duoc > 0 thi tra ve True, nguoc lai tra ve False;
            return command.executeUpdate(strSQL) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public SinhVien timKiemTheoMaSV(String maSV) {
        SinhVien objSV = null;
        Connection connection = null;
        try {

            // Ket noi den database can lam viec
            connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh MySQL de thuc hien cong viec
            Statement command = connection.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, SoCMT, DiaChi, MaKhoa FROM sinhvien WHERE MaSV = '" + maSV + "'";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = command.executeQuery(strSQL);

            while (rs.next()) {
                objSV = new SinhVien();
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getBoolean("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setSoCMT(rs.getString("SoCMT"));
                objSV.setDiaChi(rs.getString("DiaChi"));
                objSV.setMaKhoa(rs.getString("MaKhoa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally //Sau khi thực hiện xong thì đóng kết nối
        {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return objSV;
    }

    /**
     * Ham cap nhap thong tin sinh vien
     *
     * @param objSV doi tuong sinh vien can cap nhap
     * @return True neu thanh cong, False neu that bai
     */
    public boolean capNhapSinhVien(SinhVien objSV) {
        //Khai báo kết nối đến db cần làm việc
        Connection conn = null;

        try {
            //Kết nối đến db cần làm việc
            conn = DataProvider.ketNoi();

            //Khai báo 1 công việc
            Statement comm = conn.createStatement();

            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String ngaySinh = f.format(objSV.getNgaySinh());

            int gioiTinh;
            if (objSV.getGioiTinh() == true) {
                gioiTinh = 1;
            } else {
                gioiTinh = 0;
            }

            //Khai báo câu lệnh
            String strUpdate = String.format("UPDATE sinhvien SET HoTen = '%s', GioiTinh = %d, NgaySinh = '%s', DienThoai = '%s', Email = '%s', SoCMT = '%s', DiaChi = '%s', MaKhoa = '%s' WHERE MaSV = '%s'",
                    objSV.getHoTen(),
                    gioiTinh,
                    ngaySinh,
                    objSV.getDienThoai(),
                    objSV.getEmail(),
                    objSV.getSoCMT(),
                    objSV.getDiaChi(),
                    objSV.getMaKhoa(),
                    objSV.getMaSV());
            //Thực hiện công việc và nếu số dòng lớn hơn 0 thì trả true ngược lại trả về false
            return comm.executeUpdate(strUpdate) > 0;

        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally //Sau khi thực hiện xong thì đóng kết nối
        {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    /**
     * Ham xoa thong tin sinh vien
     *
     * @param maSV ma sinh vien can xoa
     * @return True neu thanh cong, False neu that bai
     */
    public boolean xoaSinhVien(String maSV) {
        // Lay doi tuong sinh vien can xoa theo ma
        try {
            // Ket noi den database can lam viec
            Connection connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh MySQL de thuc hien cong viec
            Statement command = connection.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = String.format("DELETE FROM sinhvien WHERE MaSV = '%s'", maSV);

            // Neu so dong thuc hien duoc > 0 thi tra ve True, nguoc lai tra ve False;
            return command.executeUpdate(strSQL) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
