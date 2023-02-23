/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TrenLop;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien("a",120,2,100000);
        
        System.out.println(nv.tangLuong(5));
        System.out.println(nv.getHeSoLuong());
        System.out.println(nv.tinhLuong());
        
    }
    
}
