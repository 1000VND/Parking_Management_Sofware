/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TongVeDTO;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class TongVeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<TongVeDTO> list = new ArrayList<>();

    public static ArrayList<TongVeDTO> tableMave(String loaive) {
        ArrayList<TongVeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select vID from TONGVE where LOAIVE= '" + loaive + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongVeDTO tv;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                tv = new TongVeDTO(rs.getString("vID"));
                veXelist.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    public TongVeDTO checkVe(String mave) {
        TongVeDTO tk = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select vID from TONGVE where vID='" + mave + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new TongVeDTO();
                tk.setMaVe(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    public int xoaVe(String mave) throws Exception {
        String sql = "delete from TONGVE where vID = '" + mave + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int updateVe(String mavecu, String mavemoi) throws Exception {
        String sql = "update TONGVE set vID='" + mavemoi + "' where vID='" + mavecu + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int themVe(TongVeDTO tv) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO TONGVE VALUES (?,?,?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tv.getMaVe());
            ps.setString(2, tv.getLoaiVe());
            ps.setString(3, tv.getTenKhach());
            ps.setString(4, tv.getSdt());
            ps.setString(5, tv.getBienSo());
            ps.setString(6, tv.getLoaiXe());
            ps.setString(7, tv.getMauXe());
            ps.setDate(8, date.valueOf(tv.getNgayDk()));
            ps.setInt(9, tv.getSoTien());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
