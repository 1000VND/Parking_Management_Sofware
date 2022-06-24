/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lê Quang Hưng
 */
public class NhapXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    public static ArrayList<String> LoadComboBoxChonVe() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select LOAIVE from TONGVE group by LOAIVE";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public NhapXeDTO load2Text(String mave) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TONGVE where vID =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mave);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setBienSo(rs.getString("BIENSO"));
                nx.setMauXe(rs.getString("MAUXE"));
                nx.setLoaiXe(rs.getString("LOAIXE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public static ArrayList<String> LoadComboBoxMaVe(String loaive) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "SELECT TONGVE.vID FROM TONGVE WHERE NOT EXISTS(SELECT NHAPXE.MAVE FROM NHAPXE WHERE TONGVE.vID = NHAPXE.MAVE)and LOAIVE=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaive);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<String> LoadcbxLoaiXe() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "SELECT * FROM XE";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs1 = ps.executeQuery();
            while (rs1.next()) {
                list.add(rs1.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<String> LoadcbxKhuVuc(String loaixe, String loaive) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "SELECT KHUVUC FROM TONGKHUVUC where LOAIXE=? and LOAIVE=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaixe);
            ps.setString(2, loaive);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<String> LoadcbxViTri(String loaive) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select VITRI from KHUVUCOT where not EXISTS(select NHAPXE.VITRI from NHAPXE where NHAPXE.VITRI=KHUVUCOT.VITRI) and LOAIVE=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaive);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int ThemXe(NhapXeDTO nx) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO NHAPXE VALUES (?,?,?,?,?,?,?,?,?)";
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
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
    public NhapXeDTO checkBien(String bienso){
        NhapXeDTO b = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select BIENSO from NHAPXE where BIENSO=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bienso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = new NhapXeDTO();
                b.setBienSo(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    public NhapXeDTO checkVe(String mave) {
        NhapXeDTO tk = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select MAVE from NHAPXE where MAVE='" + mave + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new NhapXeDTO();
                tk.setMaVe(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
}
