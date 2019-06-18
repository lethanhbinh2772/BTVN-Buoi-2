/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai2;

/**
 *
 * @author ZzZ
 */
public class TinhBieuThuc {

    int n;
    float s;

    public void bieuThucA() {
        do {
            for (int i = 1; i <= n; i++) {
                s += 1.0 / (2 * i);
            }
        } while (n >= 1);
    }

    public void bieuThucB() {
        do {
            for (int i = 1; i <= n; i++) {
                int p = 1;
                p *= i;
                s += p;
            }
        } while (n >= 1 && n <= 20);
    }

    public void bieuThucC() {
        do {
            s = 1-(1/(n+1));
        } while (n >= 1 && n <= 20);
    }

    public static void main(String[] args) {
        
    }

}
