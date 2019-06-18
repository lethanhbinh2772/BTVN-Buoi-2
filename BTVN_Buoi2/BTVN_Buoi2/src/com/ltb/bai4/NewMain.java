/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai4;

/**
 *
 * @author ZzZ
 */
public class NewMain {

    
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal monkey = new Monkey();
        Animal snake = new Snake();
        
        lion.displayInfo();
        monkey.displayInfo();
        snake.displayInfo();
        
    }
    
}
