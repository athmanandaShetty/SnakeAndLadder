package com.example.snakeandladder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle{
    public Tile(int tileSize){
        setWidth(tileSize);
        setHeight(tileSize);
        setFill(Color.AZURE); //filling color
        setStroke(Color.BLACK); //border color
    }

}
