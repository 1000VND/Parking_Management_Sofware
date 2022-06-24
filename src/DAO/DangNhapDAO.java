/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.AccountDTO;
import DTO.NhapXeDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class DangNhapDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public AccountDTO CheckUser(String user) {
        AccountDTO tk = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from ACCOUNT where USERNAME=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setTaiKhoan(rs.getString(1));
                tk.setTenNguoidung(rs.getString(2));
                tk.setSdt(rs.getString(3));
                tk.setMatKhau(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    public AccountDTO CheckPass(String pass, String user) {
        AccountDTO tk = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select PASS from ACCOUNT where PASS=? and USERNAME=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setMatKhau(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

    public AccountDTO CheckPhone(String phone, String user) {
        AccountDTO tk = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from ACCOUNT where PHONE=? and USERNAME=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ps.setString(2, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setTaiKhoan(rs.getString(1));
                tk.setSdt(rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;

    }

    public int ThemTk(AccountDTO tk) throws Exception {
        try {
            String sql = "INSERT INTO ACCOUNT VALUES (?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tk.getTaiKhoan());
            ps.setString(2, tk.getTenNguoidung());
            ps.setString(3, tk.getSdt());
            ps.setString(4, tk.getMatKhau());
            int update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int DoiMK(String taikhoan, String newpass, String olapass) throws Exception {
        String sql = "UPDATE ACCOUNT SET PASS='" + newpass + "' WHERE USERNAME='" + taikhoan + "' AND PASS='" + olapass + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int updateAcc(String taikhoan, String tennv, String sdt, String matkhau) throws Exception {
        String sql = "update ACCOUNT set TENNV='" + tennv + "',PHONE='" + sdt + "',PASS='" + matkhau + "' where USERNAME='" + taikhoan + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;

    }

    public int deleteAcc(String taikhoan) throws Exception {
        String sql = "delete from ACCOUNT where USERNAME = '" + taikhoan + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    List<AccountDTO> list = new ArrayList<>();

    public static ArrayList<AccountDTO> tableAcc() {
        ArrayList<AccountDTO> accounList = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from ACCOUNT order by USERNAME";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            AccountDTO nx;
            accounList.removeAll(accounList);
            while (rs.next()) {
                nx = new AccountDTO(rs.getString("USERNAME"), rs.getString("TENNV"), rs.getString("PHONE"), rs.getString("PASS"));
                accounList.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounList;
    }

    public AccountDTO findAccbyTaikhoan(String taikhoan) {
        AccountDTO ac = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from ACCOUNT where USERNAME=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ac = new AccountDTO();
                ac.setTaiKhoan(rs.getString(1));
                ac.setTenNguoidung(rs.getString(2));
                ac.setSdt(rs.getString(3));
                ac.setMatKhau(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ac;
    }
}
