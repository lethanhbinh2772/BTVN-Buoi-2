/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai1;

import java.util.Scanner;

/**
 *
 * @author ZzZ
 */
public class TinhNgayTrongThang {

    private int thang;
    private int nam;

    public TinhNgayTrongThang() {
    }

    public TinhNgayTrongThang(int thang, int nam) {
        this.thang = thang;
        this.nam = nam;
    }

    private void nhapThang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        nam = input.nextInt();
        
        System.out.println("Nhap thang: ");
        thang = input.nextInt();
        
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + " nam " + nam + " co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + " nam " + nam + " co 30 ngay.");
                break;
            case 2:
                if (nam % 4 == 0 || (nam % 100 == 0 && nam % 400 == 0)) {
                    System.out.println("Thang 2 nam " + nam + " co 29 ngay");
                } else {
                    System.out.println("Thang 2 nam " + nam + " co 28 ngay");
                }
                break;
        }
    }

    public static void main(String[] args) {
        TinhNgayTrongThang tvn = new TinhNgayTrongThang();
        tvn.nhapThang();
    }

}
