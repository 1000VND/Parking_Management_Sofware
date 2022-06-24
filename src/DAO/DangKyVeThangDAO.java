/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DKVeThangDTO;
import DTO.TongVeDTO;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class DangKyVeThangDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public int addVethang(TongVeDTO dkvt) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO TONGVE VALUES (?,?,?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dkvt.getMaVe());
            ps.setString(2, dkvt.getLoaiVe());
            ps.setString(3, dkvt.getTenKhach());
            ps.setString(4, dkvt.getSdt());
            ps.setString(5, dkvt.getBienSo());
            ps.setString(6, dkvt.getLoaiXe());
            ps.setString(7, dkvt.getMauXe());
            ps.setDate(8, date.valueOf(dkvt.getNgayDk()));
            ps.setInt(9, dkvt.getSoTien());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int addVethangTong(TongVeDTO dkvt) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "INSERT INTO DKVETHANG VALUES (?,?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dkvt.getMaVe());
            ps.setString(2, dkvt.getTenKhach());
            ps.setString(3, dkvt.getSdt());
            ps.setString(4, dkvt.getBienSo());
            ps.setString(5, dkvt.getLoaiXe());
            ps.setString(6, dkvt.getMauXe());
            ps.setDate(7, date.valueOf(dkvt.getNgayDk()));
            ps.setInt(8, dkvt.getSoTien());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int deleteVethang() throws Exception {
        String sql = "delete from TONGVE where MONTH(NGAYDK) = MONTH(GETDATE())-1";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int updateVethang(String mave, String tenkh, String sdt, String bienso, String loaixe, String mauxe) throws Exception {
        String sql = "UPDATE TONGVE SET TENKH=N'" + tenkh + "',SDT='" + sdt + "',BIENSO='" + bienso + "',LOAIXE='" + loaixe + "',MAUXE=N'" + mauxe + "'"
                + "WHERE vID='" + mave + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int updateTongvethang(String mave, String tenkh, String sdt, String bienso, String loaixe, String mauxe) throws Exception {
        String sql = "UPDATE DKVETHANG SET TENKH=N'" + tenkh + "',SDT='" + sdt + "',BIENSO='" + bienso + "',LOAIXE='" + loaixe + "',MAUXE=N'" + mauxe + "'"
                + "WHERE tID='" + mave + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public TongVeDTO checkVe(String mave) {
        TongVeDTO dkvt = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select vID from TONGVE where vID='" + mave + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dkvt = new TongVeDTO();
                dkvt.setMaVe(rs.getString("vID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dkvt;
    }

    List<TongVeDTO> list = new ArrayList<>();

    public static ArrayList<TongVeDTO> tableVethang() {
        ArrayList<TongVeDTO> accounList = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from TONGVE where LOAIVE ='Vé Tháng'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            TongVeDTO nx;
            accounList.removeAll(accounList);
            while (rs.next()) {
                nx = new TongVeDTO(rs.getString("vID"), rs.getString("LOAIVE"), rs.getString("TENKH"), rs.getString("SDT"), rs.getString("BIENSO"), rs.getString("LOAIXE"), rs.getString("MAUXE"), LocalDate(rs.getDate("NGAYDK")), rs.getInt("SOTIEN"));
                accounList.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounList;
    }

    public TongVeDTO checkVechoformVethang(String mave) {
        TongVeDTO dkvt = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TONGVE where vID='" + mave + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dkvt = new TongVeDTO();
                dkvt.setMaVe(rs.getString("vID"));
                dkvt.setTenKhach(rs.getString("TENKH"));
                dkvt.setSdt(rs.getString("SDT"));
                dkvt.setBienSo(rs.getString("BIENSO"));
                dkvt.setLoaiXe(rs.getString("LOAIXE"));
                dkvt.setMauXe(rs.getString("MAUXE"));
                dkvt.setNgayDk(LocalDate(rs.getDate("NGAYDK")));
                dkvt.setSoTien(rs.getInt("SOTIEN"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dkvt;
    }

    private static LocalDate LocalDate(Date date) {
        return LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
