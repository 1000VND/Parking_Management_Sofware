/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class QuanLyBaiXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<NhapXeDTO> list = new ArrayList<>();

    public static ArrayList<NhapXeDTO> veXe() {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from NHAPXE";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                nx = new NhapXeDTO(rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"),
                        rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"),
                        rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"));
                veXelist.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    private static LocalDate LocalDate(Date date) {
        return LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public ArrayList<NhapXeDTO> findXe(String loaixe, String loaive) {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE where LOAIXE='" + loaixe + "' and LOAIVE='" + loaive + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                nx = new NhapXeDTO(rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"),
                        rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"),
                        rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"));
                veXelist.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    public ArrayList<NhapXeDTO> findXeAll() {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                nx = new NhapXeDTO(rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"),
                        rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"),
                        rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"));
                veXelist.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    public ArrayList<NhapXeDTO> findXeTheoXe(String loaixe) {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE where LOAIXE=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaixe);
            ResultSet rs = ps.executeQuery();
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                nx = new NhapXeDTO(rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"),
                        rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"),
                        rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"));
                veXelist.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    public ArrayList<NhapXeDTO> findXeTheoVe(String loaive) {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE where LOAIVE=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaive);
            ResultSet rs = ps.executeQuery();
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                nx = new NhapXeDTO(rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("LOAIVE"),
                        rs.getString("MAVE"), rs.getString("MAUXE"), rs.getString("KHUVUC"),
                        rs.getString("VITRI"), LocalDate(rs.getDate("NGAYGUI")), rs.getString("GIOGUI"));
                veXelist.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    public static ArrayList<String> LoadComboBoxLoaiXe() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from XE";
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

    public static ArrayList<String> LoadComboBoxLoaiVe() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LOAIVE";
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
}
