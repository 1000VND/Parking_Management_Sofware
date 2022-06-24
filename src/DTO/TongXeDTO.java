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
public class TongXeDTO {

    private int stt;
    private String bienSo;
    private String loaiXe;
    private String loaiVe;
    private String maVe;
    private String mauXe;
    private String khuVuc;
    private String viTri;
    private LocalDate ngayGui;
    private String gioGui;
    private LocalDate ngayTra;
    private String gioTra;
    private int giaTien;

    public TongXeDTO() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public LocalDate getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(LocalDate ngayGui) {
        this.ngayGui = ngayGui;
    }

    public String getGioGui() {
        return gioGui;
    }

    public void setGioGui(String gioGui) {
        this.gioGui = gioGui;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getGioTra() {
        return gioTra;
    }

    public void setGioTra(String gioTra) {
        this.gioTra = gioTra;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public TongXeDTO(int stt, String bienSo, String loaiXe, String loaiVe, String maVe, String mauXe, String khuVuc, String viTri, LocalDate ngayGui, String gioGui, LocalDate ngayTra, String gioTra, int giaTien) {
        this.stt = stt;
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.loaiVe = loaiVe;
        this.maVe = maVe;
        this.mauXe = mauXe;
        this.khuVuc = khuVuc;
        this.viTri = viTri;
        this.ngayGui = ngayGui;
        this.gioGui = gioGui;
        this.ngayTra = ngayTra;
        this.gioTra = gioTra;
        this.giaTien = giaTien;
    }

}
