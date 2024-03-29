/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lê Quang Hưng
 */
public class AccountDTO {
    private int Id;
    private String taiKhoan;
    private String tenNguoidung;
    private String sdt;
    private String matKhau;

    public AccountDTO() {
    }

    public AccountDTO(int Id, String taiKhoan, String tenNguoidung, String sdt, String matKhau) {
        this.Id = Id;
        this.taiKhoan = taiKhoan;
        this.tenNguoidung = tenNguoidung;
        this.sdt = sdt;
        this.matKhau = matKhau;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getTenNguoidung() {
        return tenNguoidung;
    }

    public void setTenNguoidung(String tenNguoidung) {
        this.tenNguoidung = tenNguoidung;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    
    
    
}
