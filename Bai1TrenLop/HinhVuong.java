/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1TrenLop;

/**
 *
 * @author ADMIN
 */
public class HinhVuong {
    private int DoDaiCanh;
    private String MauSac;

    public HinhVuong() {
        DoDaiCanh=0;
        MauSac=null;
    }

    public HinhVuong(int DoDaiCanh, String MauSac) {
        this.DoDaiCanh = DoDaiCanh;
        this.MauSac = MauSac;
    }
    public HinhVuong(HinhVuong hv){
        DoDaiCanh=hv.DoDaiCanh;
        MauSac=hv.MauSac;
    }

    public int getDoDaiCanh() {
        return DoDaiCanh;
    }

    public void setDoDaiCanh(int DoDaiCanh) {
        this.DoDaiCanh = DoDaiCanh;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }
    
    public float S(){
        return DoDaiCanh*DoDaiCanh;
    }
    @Override
    public String toString(){
        return "Do dai canh: "+DoDaiCanh+" mau: "+MauSac;
    }
    
    
}
