/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai3;

import java.util.Scanner;

/**
 *
 * @author ZzZ
 */
public class Tinh {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    private int uCLN(int a,int b){
       while(b!=0){
           int i=b;
           b=a%b;
           b=i;
       }
       return b;
    }
    
    private int bCLN(int a, int b){
        if(b==0){
            return b;
        }else{
            return bCLN(a , a%b);
        }
    }
    public static void thucThi(String[] args) {
        
        Tinh hamTinh = new Tinh();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a: ");
        
        hamTinh.setA(input.nextInt());
        System.out.println("Nhap vao b: ");
        
        hamTinh.setB(input.nextInt());
        System.out.println("UCLN: "+hamTinh.uCLN(hamTinh.getA(), hamTinh.getB())
                + "BCLN: "+hamTinh.bCLN(hamTinh.getA(), hamTinh.getB()));
    }

   
}
