/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lê Quang Hưng
 */
public class TongKhuVucDTO {

    private String khuVuc;
    private String loaiVe;
    private String loaiXe;

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public TongKhuVucDTO(String khuVuc, String loaiVe, String loaiXe) {
        this.khuVuc = khuVuc;
        this.loaiVe = loaiVe;
        this.loaiXe = loaiXe;
    }

    public TongKhuVucDTO() {
    }

}
