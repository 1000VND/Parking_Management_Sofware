package DAO;

import DTO.BienBanDTO;
import DTO.TongDKVeThangDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.*;

public class BienBanDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public int addBienBan(BienBanDTO dkvt) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO BIENBAN VALUES (?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setDate(1, date.valueOf(dkvt.getNgayLap()));
            ps.setString(2, dkvt.getBienSo());
            ps.setString(3, dkvt.getTenKhachHang());
            ps.setString(4, dkvt.getSdt());
            ps.setString(5, dkvt.getLoaiXe());
            ps.setString(6, dkvt.getLoaiVe());
            ps.setString(7, dkvt.getMaVe());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    private static LocalDate LocalDate(Date date) {
        return LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static ArrayList<BienBanDTO> loadTableAll() {
        ArrayList<BienBanDTO> bienBanList = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from BIENBAN order by NGAYLAPBB";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            BienBanDTO tv;
            bienBanList.removeAll(bienBanList);
            while (rs.next()) {
                tv = new BienBanDTO(rs.getInt("ID"),
                        LocalDate(rs.getDate("NGAYLAPBB")),
                        rs.getString("BIENSO"),
                        rs.getString("TENKH"),
                        rs.getString("SDT"),
                        rs.getString("LOAIXE"),
                        rs.getString("LOAIVE"),
                        rs.getString("MAVE"));
                bienBanList.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bienBanList;
    }
    
    public static ArrayList<BienBanDTO> findByDay(String tuNgay, String denNgay) {
        ArrayList<BienBanDTO> list = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from BIENBAN where NGAYLAPBB >= '" + tuNgay + "' and NGAYLAPBB <= '" + denNgay + "' order by NGAYLAPBB";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            BienBanDTO tv;
            list.removeAll(list);
            while (rs.next()) {
                tv = new BienBanDTO(rs.getInt("ID"),
                        LocalDate(rs.getDate("NGAYLAPBB")),
                        rs.getString("BIENSO"),
                        rs.getString("TENKH"),
                        rs.getString("SDT"),
                        rs.getString("LOAIXE"),
                        rs.getString("LOAIVE"),
                        rs.getString("MAVE"));
                list.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String countTabel() {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from BIENBAN";
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
    
    public String countTabel1(String TuNgay, String DenNgay) {
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(BIENSO) from BIENBAN where NGAYLAPBB >= '" + TuNgay + "' and NGAYLAPBB <= '" + DenNgay + "'";
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
}
