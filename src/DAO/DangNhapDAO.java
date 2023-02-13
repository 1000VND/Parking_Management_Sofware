package DAO;

import DTO.AccountDTO;
import DTO.NhapXeDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DangNhapDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<AccountDTO> list = new ArrayList<>();

    public AccountDTO CheckUser(String user) {
        AccountDTO tk = null;
        try {
            CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
//            Connection conn = KetNoiDAO.getKetNoiDAO();
//            String sql = "select * from ACCOUNT where USERNAME=?";
//            PreparedStatement ps = conn.prepareStatement(sql);
            cs.setString(1, user);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                tk = new AccountDTO();
                tk.setId(rs.getInt(1));
                tk.setTaiKhoan(rs.getString(2));
                tk.setTenNguoidung(rs.getString(3));
                tk.setSdt(rs.getString(4));
                tk.setMatKhau(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }

    public AccountDTO CheckPass(String pass, String user) {
        AccountDTO tk = null;
        try {
            CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Pass(?,?)}");
//            Connection conn = KetNoiDAO.getKetNoiDAO();
//            String sql = "select PASS from ACCOUNT where PASS=? and USERNAME=?";
//            PreparedStatement ps = conn.prepareStatement(sql);
            cs.setString(1, pass);
            cs.setString(2, user);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                tk = new AccountDTO();
                tk.setId(rs.getInt(1));
                tk.setTaiKhoan(rs.getString(2));
                tk.setTenNguoidung(rs.getString(3));
                tk.setSdt(rs.getString(4));
                tk.setMatKhau(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }

    public AccountDTO CheckPhone(String phone, String user) {
        AccountDTO tk = null;
        try {
            CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Phone(?,?)}");
//            Connection conn = KetNoiDAO.getKetNoiDAO();
//            String sql = "select * from ACCOUNT where PHONE=? and USERNAME=?";
//            PreparedStatement ps = conn.prepareStatement(sql);
            cs.setString(1, phone);
            cs.setString(2, user);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setTaiKhoan(rs.getString(2));
                tk.setSdt(rs.getString(4));
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
        String sql = "update ACCOUNT set TENNV=N'" + tennv + "',PHONE='" + sdt + "',PASS='" + matkhau + "' where USERNAME='" + taikhoan + "'";
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


    public static ArrayList<AccountDTO> tableAcc() {
        ArrayList<AccountDTO> accounList = new ArrayList<>();
        try {
//            Connection conn = KetNoiDAO.getKetNoiDAO();
//            String sql = "select * from ACCOUNT order by USERNAME";
//            Statement st = conn.createStatement();
            CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Table_Account()}");
            ResultSet rs = cs.executeQuery();
            AccountDTO nx;
            accounList.removeAll(accounList);
            while (rs.next()) {
                nx = new AccountDTO(rs.getInt("Id"),rs.getString("USERNAME"), rs.getString("TENNV"), rs.getString("PHONE"), rs.getString("PASS"));
                accounList.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounList;
    }
}
