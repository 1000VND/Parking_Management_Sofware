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
public class NhapXeDTO {

    private String bienSo;
    private String loaiXe;
    private String loaiVe;
    private String maVe;
    private String mauXe;
    private String khuVuc;
    private String viTri;
    private LocalDate ngayGui;
    private String gioGui;
    

    public NhapXeDTO() {
    }

    public NhapXeDTO(String bienSo, String loaiXe, String loaiVe, String maVe, String mauXe, String khuVuc, String viTri, LocalDate ngayGui, String gioGui) {
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.loaiVe = loaiVe;
        this.maVe = maVe;
        this.mauXe = mauXe;
        this.khuVuc = khuVuc;
        this.viTri = viTri;
        this.ngayGui = ngayGui;
        this.gioGui = gioGui;
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
    
    
}
