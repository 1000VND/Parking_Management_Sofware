/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lê Quang Hưng
 */
public class KhuVucOtoDTO {

    private String maKhuvuc;
    private String loaiVe;
    private String viTri;

    public KhuVucOtoDTO() {
    }

    public KhuVucOtoDTO(String maKhuvuc, String loaiVe, String viTri) {
        this.maKhuvuc = maKhuvuc;
        this.loaiVe = loaiVe;
        this.viTri = viTri;
    }

    public String getMaKhuvuc() {
        return maKhuvuc;
    }

    public void setMaKhuvuc(String maKhuvuc) {
        this.maKhuvuc = maKhuvuc;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    
}
