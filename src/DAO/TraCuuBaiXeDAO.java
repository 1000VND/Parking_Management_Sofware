/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import DTO.KhuVucOtoDTO;
import java.sql.*;



/**
 *
 * @author alats
 */

public class TraCuuBaiXeDAO extends KetNoiDAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    
    public String XeMayTong(){
     
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) as LOAIXE from NHAPXE where LOAIXE='Xe máy'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayA(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Xe máy' and KHUVUC='A'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayB(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Xe máy' and KHUVUC='B'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayC(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Xe máy' and KHUVUC='C'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayD(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Xe máy' and KHUVUC='D'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOTong(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Ô tô'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOE(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Ô tô' and KHUVUC='E'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOConLaiE(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(a.VITRI)  from KHUVUCOT a where NOT EXISTS(select a.VITRI from NHAPXE b where b.VITRI = a.VITRI and b.KHUVUC='E' and a.oKV='E' and b.LOAIXE='Ô tô' ) and a.oKV='E'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOF(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LOAIXE) from NHAPXE where LOAIXE='Ô tô' and KHUVUC='F'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOConLaiF(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(a.VITRI)  from KHUVUCOT a where NOT EXISTS(select a.VITRI from NHAPXE b where b.VITRI = a.VITRI and b.KHUVUC='F' and a.oKV='F' and b.LOAIXE='Ô tô' ) and a.oKV='F'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

}
