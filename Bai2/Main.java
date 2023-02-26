/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
//        Student st=new Student();
//        st.setStID("abc");
//        System.out.println(st.toString());
          Book b=new Book("hoang","van","thai");
          Book c=new Book(b);
          System.out.println(c.getBoAuthor()+c.getBoCode());
    }
}
