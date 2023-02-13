/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author Lê Quang Hưng
 */
public class BienBanDTO {

    private int Id;
    private LocalDate ngayLap;
    private String bienSo;
    private String tenKhachHang;
    private String sdt;
    private String loaiXe;
    private String loaiVe;
    private String maVe;

    public BienBanDTO() {
    }

    public BienBanDTO(int Id, LocalDate ngayLap, String bienSo, String tenKhachHang, String sdt, String loaiXe, String loaiVe, String maVe) {
        this.Id = Id;
        this.ngayLap = ngayLap;
        this.bienSo = bienSo;
        this.tenKhachHang = tenKhachHang;
        this.sdt = sdt;
        this.loaiXe = loaiXe;
        this.loaiVe = loaiVe;
        this.maVe = maVe;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    
}
