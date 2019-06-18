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
public class Snake extends Animal {
    
    private Snake snake;
    private float snakeLength;

    public float getSnakeLength() {
        return snakeLength;
    }

    public void setSnakeLength(float snakeLength) {
        this.snakeLength = snakeLength;
    }
    
    void Boa(){
        
        snake.setAnimalName("Boa");
        snake.setAnimalWeight(50f);
        snake.setSnakeLength(5f);
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(snake.getAnimalName());
        System.out.println(snake.getAnimalWeight());
        System.out.println(snake.getSnakeLength());
    }
    
    
    
}
