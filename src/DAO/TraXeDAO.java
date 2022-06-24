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
public class TraXeDAO extends KetNoiDAO {

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

    public NhapXeDTO findXebyBienso(String bienso) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE where BIENSO=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bienso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setBienSo(rs.getString(1));
                nx.setLoaiXe(rs.getString(2));
                nx.setLoaiVe(rs.getString(3));
                nx.setMaVe(rs.getString(4));
                nx.setMauXe(rs.getString(5));
                nx.setKhuVuc(rs.getString(6));
                nx.setViTri(rs.getString(7));
                nx.setNgayGui(LocalDate(rs.getDate(8)));
                nx.setGioGui(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public NhapXeDTO findXebyMave(String mave) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAPXE where MAVE=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mave);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setBienSo(rs.getString(1));
                nx.setLoaiXe(rs.getString(2));
                nx.setLoaiVe(rs.getString(3));
                nx.setMaVe(rs.getString(4));
                nx.setMauXe(rs.getString(5));
                nx.setKhuVuc(rs.getString(6));
                nx.setViTri(rs.getString(7));
                nx.setNgayGui(LocalDate(rs.getDate(8)));
                nx.setGioGui(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    
}
