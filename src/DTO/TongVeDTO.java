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
public class TongVeDTO {

    private String maVe;
    private String loaiVe;
    private String tenKhach;
    private String sdt;
    private String bienSo;
    private String loaiXe;
    private String mauXe;
    private LocalDate ngayDk;
    private int soTien;

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public LocalDate getNgayDk() {
        return ngayDk;
    }

    public void setNgayDk(LocalDate ngayDk) {
        this.ngayDk = ngayDk;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public TongVeDTO(String maVe, String loaiVe, String tenKhach, String sdt, String bienSo, String loaiXe, String mauXe, LocalDate ngayDk, int soTien) {
        this.maVe = maVe;
        this.loaiVe = loaiVe;
        this.tenKhach = tenKhach;
        this.sdt = sdt;
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.mauXe = mauXe;
        this.ngayDk = ngayDk;
        this.soTien = soTien;
    }

    public TongVeDTO(String maVe) {
        this.maVe = maVe;
    }

    public TongVeDTO() {
    }

}
