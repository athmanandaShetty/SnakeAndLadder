package com.example.snakeandladder;

public class Dice {
    public int getRolledValue(){
        return (int)(Math.random()*6 + 1);
    }
}
