/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String ID;
    private String Name;
    private String Class;
    
    
    Student(){
        ID=null;
        Name=null;
        Class=null;
    }
    Student(String ID,String Name,String Class){
        this.ID=ID;
        this.Name=Name;
        this.Class=Class;
    }
    Student(Student s){
        this.ID=s.ID;
        this.Name=s.Name;
        this.Class=s.Class;
    }
    public String getStID(){
        return ID;
    }
    public String getStName(){
        return Name;
    }
    public String getStClass(){
        return Class;
    }
    public void setStID(String ID){
        this.ID=ID;
    }
    public void setStName(String Name){
        this.Name=Name;
    }
    public void setStClass(String Class){
        this.Class=Class;
    }
    public String toString(){
        return "ID: "+ID+" Name: "+Name+" Class: "+Class;
    }
}
