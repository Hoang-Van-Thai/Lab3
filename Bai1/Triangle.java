/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ADMIN
 */
public class Triangle {
    
    float width=0f;
    float hegth=0f;
    
    Triangle(){
        this.width=0;
        this.hegth=0;
    };
    Triangle(float width,float hegth){
        this.width=width;
        this.hegth=hegth;
    };
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHegth() {
        return hegth;
    }

    public void setHegth(float hegth) {
        this.hegth = hegth;
    }
    @Override
    public String toString(){
        return "Chieu dai canh day: "+this.width+"Chieu cao: "+this.hegth;
    }
}
