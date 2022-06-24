/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TongDKVeThangDTO;
import DTO.TongXeDTO;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class ThongKeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<TongXeDTO> list = new ArrayList<>();

    public static ArrayList<TongXeDTO> findCar(String Loaixe, String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> tongXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TONGXE where LOAIXE='" + Loaixe + "'and NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "' order by NGAYTRA";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongXeDTO tv;
            tongXelist.removeAll(tongXelist);
            while (rs.next()) {
                tv = new TongXeDTO(rs.getInt("STT"), rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"), rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"), rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"), LocalDate(rs.getDate("NGAYTRA")), rs.getString("GIOTRA"), rs.getInt("TONGTIEN"));
                tongXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongXelist;
    }

    public static ArrayList<TongXeDTO> findCarAll( String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> tongXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TONGXE where NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "' order by NGAYTRA";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongXeDTO tv;
            tongXelist.removeAll(tongXelist);
            while (rs.next()) {
                tv = new TongXeDTO(rs.getInt("STT"), rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"), rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"), rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"), LocalDate(rs.getDate("NGAYTRA")), rs.getString("GIOTRA"), rs.getInt("TONGTIEN"));
                tongXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongXelist;
    }
    public static ArrayList<TongXeDTO> loadTableAll() {
        ArrayList<TongXeDTO> tongXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TONGXE order by NGAYTRA";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongXeDTO tv;
            tongXelist.removeAll(tongXelist);
            while (rs.next()) {
                tv = new TongXeDTO(rs.getInt("STT"), rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"), rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"), rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"), LocalDate(rs.getDate("NGAYTRA")), rs.getString("GIOTRA"), rs.getInt("TONGTIEN"));
                tongXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongXelist;
    }

    public String loadCountAll() {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from TONGXE";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public String loadCountTimeAll(String TuNgay, String DenNgay) {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from TONGXE where NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public String loadCountTime(String Loaixe, String TuNgay, String DenNgay) {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from TONGXE where LOAIXE='" + Loaixe + "' and NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public int loadMoneyAll() {
        int nx = 0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select Sum(TONGTIEN) from TONGXE ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public int loadMoneyTimeAll(String TuNgay, String DenNgay) {
        int nx = 0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select Sum(TONGTIEN) from TONGXE where NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public int loadMoneyTime(String Loaixe, String TuNgay, String DenNgay) {
        int nx = 0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select Sum(TONGTIEN) from TONGXE where LOAIXE='" + Loaixe + "' and NGAYTRA >= '" + TuNgay + "' and NGAYTRA <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    //
    //
    //
    //
    //
    //
    //                    KHOẢNG TRẮNG NÀY ĐỂ NGĂN CÁCH GIỮA 2 FORM
    //
    //
    //
    //
    //
    //
    //
    
    // form tổng đăng ký vé tháng
    public static ArrayList<TongDKVeThangDTO> loadTableVethang() {
        ArrayList<TongDKVeThangDTO> tongXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from DKVETHANG order by NGAYDK";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongDKVeThangDTO tv;
            tongXelist.removeAll(tongXelist);
            while (rs.next()) {
                tv = new TongDKVeThangDTO(rs.getInt("STT"),
                        rs.getString("tID"),
                        rs.getString("TENKH"),
                        rs.getString("SDT"),
                        rs.getString("BIENSO"),
                        rs.getString("LOAIXE"),
                        rs.getString("MAUXE"),
                        LocalDate(rs.getDate("NGAYDK")),
                        rs.getInt("SOTIEN"));
                tongXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongXelist;
    }

    public static ArrayList<TongDKVeThangDTO> findDKYVETHANG(String TuNgay, String DenNgay) {
        ArrayList<TongDKVeThangDTO> tongXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from DKVETHANG where NGAYDK >= '" + TuNgay + "' and NGAYDK <= '" + DenNgay + "' order by NGAYDK";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongDKVeThangDTO tv;
            tongXelist.removeAll(tongXelist);
            while (rs.next()) {
                tv = new TongDKVeThangDTO(
                        rs.getInt("STT"),
                        rs.getString("tID"),
                        rs.getString("TENKH"),
                        rs.getString("SDT"),
                        rs.getString("BIENSO"),
                        rs.getString("LOAIXE"),
                        rs.getString("MAUXE"),
                        LocalDate(rs.getDate("NGAYDK")),
                        rs.getInt("SOTIEN"));
                tongXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongXelist;
    }

    public String loadCountTime2(String TuNgay, String DenNgay) {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from DKVETHANG where NGAYDK >= '" + TuNgay + "' and NGAYDK <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public String loadCountAll2() {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from DKVETHANG";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public String loadTien() {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select sum(SOTIEN) from DKVETHANG";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public String loadTienTime(String TuNgay, String DenNgay) {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select sum(SOTIEN) from DKVETHANG where NGAYDK >= '" + TuNgay + "' and NGAYDK <= '" + DenNgay + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    private static LocalDate LocalDate(Date date) {
        return LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

}
