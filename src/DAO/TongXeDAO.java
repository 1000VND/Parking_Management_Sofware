/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TongXeDTO;
import java.sql.*;

/**
 *
 * @author Lê Quang Hưng
 */
public class TongXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public int themXe(TongXeDTO nx) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO TONGXE VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nx.getBienSo());
            ps.setString(2, nx.getLoaiXe());
            ps.setString(3, nx.getLoaiVe());
            ps.setString(4, nx.getMaVe());
            ps.setString(5, nx.getMauXe());
            ps.setString(6, nx.getKhuVuc());
            ps.setString(7, nx.getViTri());
            ps.setDate(8, date.valueOf(nx.getNgayGui()));
            ps.setString(9, nx.getGioGui());
            ps.setDate(10, date.valueOf(nx.getNgayTra()));
            ps.setString(11, nx.getGioTra());
            ps.setInt(12, nx.getGiaTien());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int xoaXekhoibai(String bienso) throws Exception {
        String sql = "delete from NHAPXE where BIENSO = '" + bienso + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }
}
