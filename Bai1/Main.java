/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Point2D p=new Point2D();
//        System.out.println(p.getX());
//          Triangle tr=new Triangle();
//          tr.setHegth(4);
//          tr.setWidth(10);
//          System.out.println(tr.toString());
            Fraction f= new Fraction(1,20);
            Fraction a=new Fraction(f);
            Fraction b=f.reduce();
            System.out.println(a.getDenominator());
            System.out.println(b.getNumerator()+"/"+b.getDenominator()); 
    }
    
}
