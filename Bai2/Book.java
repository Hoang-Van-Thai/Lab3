/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ADMIN
 */
public class Book {
     private String boCode;
     private String boTitle;
     private String boAuthor;
     Book(){
         boCode=null;
         boTitle=null;
         boAuthor=null;
     }
     Book(String boCode,String boTitle,String boAuthor){
         this.boCode=boCode;
         this.boTitle=boTitle;
         this.boAuthor=boAuthor;
     }
     Book(Book b){
         boCode=b.boCode;
         boTitle=b.boTitle;
         boAuthor=b.boAuthor;
     }

    public String getBoCode() {
        return boCode;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }
     
}
